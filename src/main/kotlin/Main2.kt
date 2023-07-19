// Step 1: Open Android Studio and create a new Android project.

// Step 2: Create a new Kotlin file called "MainActivity.kt" and define a MainActivity class.
class MainActivity {
    // Step 3: Define an enum class called "Team" with the provided teams.
    enum class Team {
        MERCEDES,
        RED_BULL_RACING,
        FERRARI,
        MCLAREN,
        ASTON_MARTIN,
        ALPINE,
        ALPHA_TAURI,
        ALFA_ROMEO,
        HAAS,
        WILLIAMS
    }

    // Step 4: Define the "printTeamDetails" function.
    fun printTeamDetails(team: Team) {
        // Step 5: Implement the tasks inside the "printTeamDetails" function.
        // Task 1: Print Team Details
        println("Team: $team")

        // Task 2: Switch Statement
        val message = when (team) {
            Team.MERCEDES -> "Mercedes is a top-performing team."
            Team.RED_BULL_RACING -> "Red Bull Racing is known for its aggressive driving style."
            Team.FERRARI -> "Ferrari is an iconic team in Formula 1."
            Team.MCLAREN -> "McLaren has a rich history in motorsport."
            Team.ASTON_MARTIN -> "Aston Martin returned to Formula 1 in 2021."
            Team.ALPINE -> "Alpine is the rebranded Renault team."
            Team.ALPHA_TAURI -> "AlphaTauri is the sister team of Red Bull Racing."
            Team.ALFA_ROMEO -> "Alfa Romeo has a partnership with Sauber Motorsport."
            Team.HAAS -> "Haas is a newer team on the grid."
            Team.WILLIAMS -> "Williams has a long-standing presence in Formula 1."
        }
        println("Message: $message")
    }
}

// Step 6: Call the "printTeamDetails" function in the MainActivity's onCreate() method.
fun main() {
    val mainActivity = MainActivity()
    val team = MainActivity.Team.MERCEDES
    mainActivity.printTeamDetails(team)
}
