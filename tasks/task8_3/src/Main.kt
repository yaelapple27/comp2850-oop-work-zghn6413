// Task 8.3: weather station temperature analysis program

fun main() {
    // Add code here to:
    //   - Fetch data
    //   - Find records with lowest and and highest temperatures
    //   - Compute average temperature
    //   - Display all of these statistics
    val data = fetchData()
    val temps = data.map{ it.second }
    val lowest = temps.min()
    val highest = temps.max()

    val highestStation = data.first {it.second == highest}
    val lowestStation = data.first {it.second == lowest}
    val averageStation = averageTemp(data)

    println("Lowest temp: $lowest at $lowestStation, Highest temp: $highest at $highestStation, Average temp: %.2f".format(averageStation))
}
