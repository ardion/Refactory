package Inventory

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import jsonList
import java.text.SimpleDateFormat
import java.util.*


fun main() {
    println(
        "1.Find items in Meeting Room.\n" +
                "2.Find all electronic devices.\n" +
                "3.Find all furnitures.\n" +
                "4.Find all items was purchased at 16 Januari 2020.\n" +
                "5.Find all items with brown color.\n"
    )

    print("Enter the question number : ")
    var question = readLine()!!.toInt()
    val gson = Gson()
    val json = jsonList().jsonInventory
    var listType = object : TypeToken<List<Inventory>>() {}.type
    var dataInventory: List<Inventory> = gson.fromJson(json, listType)
    var total=0

    for (i in dataInventory.indices) {
        var data = dataInventory[i]
        when (question) {
            1 -> {
                var place = data.placement.name
                if (place == "Meeting Room") {
                    println("Name : ${data.name}")
                }
            }
            2 -> {
                var type = data.type
                if (type == "electronic") {
                    println("Name : ${data.name}")
                }
            }

            3 -> {
                var type = data.type
                if (type == "furniture") {
                    println("Name : ${data.name}")
                }
            }

            4 -> {
                var date = convertTime(data.purchased_at)
                if (date == "16 January 2020") {
                    println("Name : ${data.name}")
                    total+=1
                }
                if (total == 0 && i == dataInventory.size - 1) println("Nothing")
            }
            5 -> {
                var tags = data.tags
                for (tag in 0..tags.size - 1) {
                    if (tags[tag] == "brown") {
                        println("Name : ${data.name}")
                    }
                }
            }
        }

    }
}

fun convertTime(time: Long): String {
    val sdf = Date(time*1000L)
    val format = SimpleDateFormat("dd MMMMM yyyy")
    return format.format(sdf)
}
