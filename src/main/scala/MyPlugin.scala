import sbt._

object MyPlugin extends Plugin
{
    // configuration points, like the built in `version`, `libraryDependencies`, or `compile`
    // by implementing Plugin, these are automatically imported in a user's `build.sbt`
    val newTask = taskKey[Unit]("A new task.")
    val newSetting = settingKey[String]("A new setting.")

    // a group of settings ready to be added to a Project
    // to automatically add them, do
    val newSettings = Seq(
        newSetting := "test",
        newTask := println(newSetting.value)
    )

    // alternatively, by overriding `settings`, they could be automatically added to a Project
    // override val settings = Seq(...)
}