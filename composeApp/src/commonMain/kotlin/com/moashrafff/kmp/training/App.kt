package com.moashrafff.kmp.training

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
//import com.moashraf.core.ReusableText
import com.moashrafff.kmp.training.database.PeopleDao
import com.moashrafff.kmp.training.dependencies.MyViewModel
//import dev.icerock.moko.permissions.PermissionState
//import dev.icerock.moko.permissions.compose.BindEffect
//import dev.icerock.moko.permissions.compose.rememberPermissionsControllerFactory
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinContext
import org.koin.compose.viewmodel.koinViewModel
import org.koin.core.annotation.KoinExperimentalAPI


@OptIn(KoinExperimentalAPI::class)
@Composable
@Preview
fun App(
//    batteryManager: BatteryManager
//    , peopleDao: PeopleDao
) {
    MaterialTheme {
        KoinContext {
            NavHost(
                navController = rememberNavController(),
                startDestination = "home"
            ){
                composable(route = "home") {
                    val viewModel = koinViewModel<MyViewModel>()
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(viewModel.getHelloWorld())
                    }
                }
            }
        }

//        val people by peopleDao.getPeople().collectAsState(initial = emptyList())
//        val scope = rememberCoroutineScope()
//        val factory = rememberPermissionsControllerFactory()
//        val controller = remember(factory) {
//            factory.createPermissionsController()
//        }

//        BindEffect(permissionsController = controller)

//        val viewmodel = viewModel { PermissionViewmodel(controller = controller) }

//        Column(modifier = Modifier.fillMaxSize(),
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//
////            ReusableText()
//
////            when(viewmodel.state) {
////                PermissionState.Granted -> Text("Record Audio Permission Granted!")
////                PermissionState.DeniedAlways -> {
////                    Text("Permission was permanently denied!")
////                    Button(
////                        onClick = {
////                            controller.openAppSettings()
////                        },
////                        content = {
////                            Text("Go to Settings")
////                        }
////                    )
////                } else -> {
////                Button(
////                    onClick = {
////                        viewmodel.provideOrRequestRecordAudioPermission()
////                    },
////                    content = {
////                        Text("Request Permission")
////                    }
////                )
////                }
////            }
//
//        }


//        LaunchedEffect(key1 = Unit) {
//            val peopleList = listOf(
//                Person("Mohamed"), Person("Nadine"), Person("Mama")
//            )
//            scope.launch {
//                peopleList.forEach {
//                    peopleDao.upsertPerson(it)
//                }
//            }
//        }
//        Column(modifier = Modifier.fillMaxSize()) {
//            Text(
//                text = "The current battery level is ${batteryManager.getBatteryLevel()}%"
//            )
//            Text(
//                text = stringResource(Res.string.hello_world)
//            )
//        }
//        LazyColumn(modifier = Modifier.fillMaxSize().padding(PaddingValues(16.dp))) {
//            items(people) { person ->
//                Box(
//                    modifier = Modifier.fillMaxSize().clickable {
//                        scope.launch {
//                            peopleDao.deletePerson(person)
//                        }
//                    }, contentAlignment = Alignment.Center
//                ) {
//                    Text(
//                        text = person.name,
//                        fontSize = MaterialTheme.typography.headlineMedium.fontSize
//                    )
//                    Spacer(Modifier.height(16.dp))
//                }
//            }
//        }
    }
}