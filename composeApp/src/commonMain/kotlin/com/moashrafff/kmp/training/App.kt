package com.moashrafff.kmp.training

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.moashrafff.kmp.training.database.PeopleDao
import com.moashrafff.kmp.training.database.Person
import kmptraining.composeapp.generated.resources.Res
import kmptraining.composeapp.generated.resources.hello_world
import kotlinx.coroutines.launch
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App(
    batteryManager: BatteryManager, peopleDao: PeopleDao
) {
    MaterialTheme {
        val people by peopleDao.getPeople().collectAsState(initial = emptyList())
        val scope = rememberCoroutineScope()
        LaunchedEffect(key1 = Unit) {
            val peopleList = listOf(
                Person("Mohamed"), Person("Nadine"), Person("Mama")
            )
            scope.launch {
                peopleList.forEach {
                    peopleDao.upsertPerson(it)
                }
            }
        }
//        Column(modifier = Modifier.fillMaxSize()) {
//            Text(
//                text = "The current battery level is ${batteryManager.getBatteryLevel()}%"
//            )
//            Text(
//                text = stringResource(Res.string.hello_world)
//            )
//        }
        LazyColumn(modifier = Modifier.fillMaxSize().padding(PaddingValues(16.dp))) {
            items(people) { person ->
                Box(
                    modifier = Modifier.fillMaxSize().clickable {
                        scope.launch {
                            peopleDao.deletePerson(person)
                        }
                    }, contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = person.name,
                        fontSize = MaterialTheme.typography.headlineMedium.fontSize
                    )
                    Spacer(Modifier.height(16.dp))
                }
            }
        }
    }
}