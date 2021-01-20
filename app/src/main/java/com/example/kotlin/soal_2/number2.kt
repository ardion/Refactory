package Profile


import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import jsonList

fun main() {
    println(
        "1. Find users who doesn't have any phone numbers. \n" +
                "2. Find users who have articles. \n" +
                "3. Find users who have \"annis\" on their name. \n" +
                "4. Find users who have articles on year 2020. \n" +
                "5. Find users who are born on 1986. \n" +
                "6. Find articles that contain \"tips\" on the title. \n" +
                "7. Find articles published before August 2019.\n"
    )

    print("Enter the question number : ")
    val question = readLine()?.toInt()
    val gson = Gson()
    val listType = object : TypeToken<List<Data>>() {}.type
    val json = jsonList().jsonData
    var dataJson: List<Data> = gson.fromJson(json, listType)
    var Username: String
    var Total = 0
    for (i in dataJson.indices) {
        when (question) {
            1 -> {
                val phone = dataJson[i].profile?.phones?.size
                if (phone == 0) {
                    Username = dataJson[i].username
                    println(Username)
                }
            }

            2 -> {
                val articles = dataJson[i].articles?.size
                if (articles != 0) {
                    Username = dataJson[i].username
                    println(Username)
                }
            }

            3 -> {
                val fullname = dataJson[i].profile?.full_name
                val wordName = fullname?.split(" ")
                if (wordName != null) {
                    for (word in 0..wordName.size - 1) {
                        var charname = wordName[word].split("")
                        var name = ""
                        for (char in 1..charname.size - 1) {
                            name += charname[char]
                            if (name.toLowerCase() == "annis") {
                                println(fullname)
                            }
                        }
                    }
                }
            }

            4 -> {
                val articles = dataJson[i].articles?.size
                var nart = 0
                if (articles != 0) {
                    var publish = dataJson[i].articles
                    for (count in publish.indices) {
                        var splitPublish = publish[count]?.published_at.split("-")
                        if (splitPublish[0].toInt() == 2020) {
                            nart += 1
                        }
                    }
                    if (nart != 0) {
                        println(dataJson[i].username)
                    }
                    Total += nart
                    if (Total == 0 && i == dataJson.size - 1) println("Nothing")
                }
            }

            5 -> {
                val born = dataJson[i].profile?.birthday
                val bornSplit = born?.split("-")
                if(bornSplit?.get(0)?.toInt() ==1986){
                    println(dataJson[i].username)
                    Total+=1
                }
                if (Total == 0 && i == dataJson.size - 1) println("Nothing")
            }

            6 -> {
                val articles = dataJson[i].articles
                val totalArticles = articles.size
                if (totalArticles != 0) {
                    for (count in articles.indices) {
                        var titleArticles = articles[count].title
                        var wordTitle = titleArticles.split(" ")
                        for (word in 0..wordTitle.size - 1) {
                            var splitWord = wordTitle[word].split("")
                            var wordTips = ""
                            for (char in 1..splitWord.size - 1) {
                                wordTips += splitWord[char]
                            }
                            if (wordTips.toLowerCase() == "tips") {
                                Total+=1
                                println(titleArticles)
                            }
                        }

                    }
                    if (Total == 0 && i == dataJson.size - 1) println("Nothing")
                }
            }

            7 -> {
                val articles = dataJson[i].articles
                val countArticles = articles.size
                if (countArticles != 0) {
                    for (j in 0..countArticles - 1) {
                        var month = ""
                        var year = ""
                        val publish = articles[j].published_at
                        val splitPublish = publish.split("-")
                        year=splitPublish[0]
                        month=splitPublish[1]
                        if (year.toInt() < 2020 && month.toInt() < 8) {
                            Total++
                            println(articles[j].title)
                        }
                    }
                }
                if (Total == 0 && i == dataJson.size - 1) println("Nothing")
            }
        }
    }

}
