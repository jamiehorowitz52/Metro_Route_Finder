    /**
     * A class which represents a Metro station.
     *
     * In Kotlin, a `data class` is similar to a regular `class`, but is meant for holding strictly data (as opposed to a class
     * meant to do some processing or implement some behavior). We'll learn more about data classes in a future lecture.
     *
     * https://kotlinlang.org/docs/reference/data-classes.html
     *
     * You can access the fields in a data class using getters / dot-notation:
     *     val foggyBottom = Station(name = "Foggy Bottom-GWU", code = "C04")
     *     println(foggyBottom.name)
     *     println(foggyBottom.code)
     *
     * @param name The human-readable name of the station (e.g. "Foggy Bottom-GWU")
     * @param code The unique identifier for a particular station / station platform (e.g. "C04")
     *
     * YOU MAY NOT MODIFY THIS CLASS.
     */
    data class Station(val name: String, val code: String)

    /**
     * Stations, in order, for the Silver line.
     *
     * YOU MAY NOT MODIFY THIS LIST.
     */
    val SILVER_LINE = listOf(
        Station(name = "Wiehle-Reston East", code = "N06"),
        Station(name = "Spring Hill", code = "N04"),
        Station(name = "Greensboro", code = "N03"),
        Station(name = "Tysons Corner", code = "N02"),
        Station(name = "McLean", code = "N01"),
        Station(name = "East Falls Church", code = "K05"),
        Station(name = "Ballston-MU", code = "K04"),
        Station(name = "Virginia Square-GMU", code = "K03"),
        Station(name = "Clarendon", code = "K02"),
        Station(name = "Court House", code = "K01"),
        Station(name = "Rosslyn", code = "C05"),
        Station(name = "Foggy Bottom-GWU", code = "C04"),
        Station(name = "Farragut West", code = "C03"),
        Station(name = "McPherson Square", code = "C02"),
        Station(name = "Metro Center", code = "C01"),
        Station(name = "Federal Triangle", code = "D01"),
        Station(name = "Smithsonian", code = "D02"),
        Station(name = "L'Enfant Plaza", code = "D03"),
        Station(name = "Federal Center SW", code = "D04"),
        Station(name = "Capitol South", code = "D05"),
        Station(name = "Eastern Market", code = "D06"),
        Station(name = "Potomac Ave", code = "D07"),
        Station(name = "Stadium-Armory", code = "D08"),
        Station(name = "Benning Road", code = "G01"),
        Station(name = "Capitol Heights", code = "G02"),
        Station(name = "Addison Road-Seat Pleasant", code = "G03"),
        Station(name = "Morgan Boulevard", code = "G04"),
        Station(name = "Largo Town Center", code = "G05")
    )

    /**
     * Stations, in order, for the Orange line.
     *
     * YOU MAY NOT MODIFY THIS LIST.
     */
    val ORANGE_LINE = listOf(
        Station(name = "Vienna/Fairfax-GMU", code = "K08"),
        Station(name = "Dunn Loring-Merrifield", code = "K07"),
        Station(name = "West Falls Church-VT/UVA", code = "K06"),
        Station(name = "East Falls Church", code = "K05"),
        Station(name = "Ballston-MU", code = "K04"),
        Station(name = "Virginia Square-GMU", code = "K03"),
        Station(name = "Clarendon", code = "K02"),
        Station(name = "Court House", code = "K01"),
        Station(name = "Rosslyn", code = "C05"),
        Station(name = "Foggy Bottom-GWU", code = "C04"),
        Station(name = "Farragut West", code = "C03"),
        Station(name = "McPherson Square", code = "C02"),
        Station(name = "Metro Center", code = "C01"),
        Station(name = "Federal Triangle", code = "D01"),
        Station(name = "Smithsonian", code = "D02"),
        Station(name = "L'Enfant Plaza", code = "D03"),
        Station(name = "Federal Center SW", code = "D04"),
        Station(name = "Capitol South", code = "D05"),
        Station(name = "Eastern Market", code = "D06"),
        Station(name = "Potomac Ave", code = "D07"),
        Station(name = "Stadium-Armory", code = "D08"),
        Station(name = "Minnesota Ave", code = "D09"),
        Station(name = "Deanwood", code = "D10"),
        Station(name = "Cheverly", code = "D11"),
        Station(name = "Landover", code = "D12"),
        Station(name = "New Carrollton", code = "D13")
    )

    /**
     * Stations, in order, for the Blue line.
     *
     * YOU MAY NOT MODIFY THIS LIST.
     */
    val BLUE_LINE = listOf(
        Station(name = "Franconia-Springfield", code = "J03"),
        Station(name = "Van Dorn Street", code = "J02"),
        Station(name = "King St-Old Town", code = "C13"),
        Station(name = "Braddock Road", code = "C12"),
        Station(name = "Ronald Reagan Washington National Airport", code = "C10"),
        Station(name = "Crystal City", code = "C09"),
        Station(name = "Pentagon City", code = "C08"),
        Station(name = "Pentagon", code = "C07"),
        Station(name = "Arlington Cemetery", code = "C06"),
        Station(name = "Rosslyn", code = "C05"),
        Station(name = "Foggy Bottom-GWU", code = "C04"),
        Station(name = "Farragut West", code = "C03"),
        Station(name = "McPherson Square", code = "C02"),
        Station(name = "Metro Center", code = "C01"),
        Station(name = "Federal Triangle", code = "D01"),
        Station(name = "Smithsonian", code = "D02"),
        Station(name = "L'Enfant Plaza", code = "D03"),
        Station(name = "Federal Center SW", code = "D04"),
        Station(name = "Capitol South", code = "D05"),
        Station(name = "Eastern Market", code = "D06"),
        Station(name = "Potomac Ave", code = "D07"),
        Station(name = "Stadium-Armory", code = "D08"),
        Station(name = "Benning Road", code = "G01"),
        Station(name = "Capitol Heights", code = "G02"),
        Station(name = "Addison Road-Seat Pleasant", code = "G03"),
        Station(name = "Morgan Boulevard", code = "G04"),
        Station(name = "Largo Town Center", code = "G05")
    )

// If needed, you may add additional data structures / variables in this global scope

    fun main(args: Array<String>) {
        val exampleInput = "G04" // Metro Center

        pathFromFoggyBottom(exampleInput)
    }

    //returns true if your current station is FoggyBottom (don't need to ride the metro)
    val myLambda: (String) -> Boolean = { destinationCode: String ->
        val yes = destinationCode.equals("C04")
        yes
    }

    fun pathFromFoggyBottom(destinationCode: String) {
        // TODO Implement this function according to the homework description

        //checks if the starting station is empty
        if(destinationCode == null)
        {
            println("No starting station inputted.")
            return
        }

        //checks if the destination station is FoggyBottom
        else if (myLambda(destinationCode) == true)
        {
            println("Current station is Foggy Bottom. Don't take the metro.")
            return
        }

        //determine which color line the destination station is on
            //if not on BLUE, ORANGE, SILVER, return error message
        //iterate through that line until you reach destination
        //print out the name of each station as you go

        else
        {
            if(onSilver(destinationCode) != -1) //if starting station is on the silver line
            {
                var i = onSilver(destinationCode) //index of destination
                var j = SILVER_LINE.indexOf(Station("Foggy Bottom-GWU", "C04")) //index of Foggy

                if(i<j) { //if destination station is west of Foggy Bottom
                    println("Direction: Wiehle-Reston East")
                    println("")
                    while (SILVER_LINE[j].code != destinationCode) {
                        println(SILVER_LINE[j].name)
                        j--
                    }
                    println(SILVER_LINE[j].name)
                }

                if(i>j) { //if destination station is east of Foggy Bottom
                    println("Direction: Largo Town Center")
                    println("")
                    while (SILVER_LINE[j].code != destinationCode) {
                        println(SILVER_LINE[j].name)
                        j++
                    }
                    println(SILVER_LINE[j].name)
                }
                return
            }

            else if(onOrange(destinationCode) != -1) //if starting station is on the orange line
            {
                var i = onOrange(destinationCode)
                var j = ORANGE_LINE.indexOf(Station("Foggy Bottom-GWU", "C04")) //index of Foggy

                if(i<j) { //if destination station is west of Foggy Bottom
                    println("Direction: Vienna")
                    println("")
                    while (ORANGE_LINE[j].code != destinationCode) {
                        println(ORANGE_LINE[j].name)
                        j--
                    }
                    println(ORANGE_LINE[j].name)
                }

                if(i>j) { //if destination station is east of Foggy Bottom
                    println("Direction: New Carrollton")
                    println("")
                    while (ORANGE_LINE[j].code != destinationCode) {
                        println(ORANGE_LINE[j].name)
                        j++
                    }
                    println(ORANGE_LINE[j].name)
                }
                return
            }

            else if(onBlue(destinationCode) != -1) //if starting station is on the blue line
            {
                var i = onBlue(destinationCode) //index of destination
                var j = BLUE_LINE.indexOf(Station("Foggy Bottom-GWU", "C04")) //index of Foggy

                if(i<j) { //if destination station is west of Foggy Bottom
                    println("Direction: Franconia-Springfield")
                    println("")
                    while (BLUE_LINE[j].code != destinationCode) {
                        println(BLUE_LINE[j].name)
                        j--
                    }
                    println(BLUE_LINE[j].name)
                }

                if(i>j) { //if destination station is east of Foggy Bottom
                    println("Direction: Largo Town Center")
                    println("Largo Town Center")
                    while (BLUE_LINE[j].code != destinationCode) {
                        println(BLUE_LINE[j].name)
                        j++
                    }
                    println(BLUE_LINE[j].name)
                }
                return
            }

            else
            {
                println("Destination station is not on the Silver, Orange, or Blue lines")
                return
            }
        }
    }

    //return index of ending track if is on the SILVER line
    fun onSilver(destinationCode: String): Int {
        SILVER_LINE.forEach{
            if(it.code==destinationCode) {
                println("Destination: " + it.name)
                println("Line: Silver")
                println("")
                return SILVER_LINE.indexOf(it)
            }
        }
        return -1
    }

    //return index of ending track if is on the ORANGE line
    fun onOrange(destinationCode: String): Int {
        ORANGE_LINE.forEach{
            if(it.code==destinationCode) {
                println("Destination: " + it.name)
                println("Line: Oragne")
                println("")
                return ORANGE_LINE.indexOf(it)
            }
        }
        return -1
    }

    //return index of ending track if is on the BLUE line
    fun onBlue(destinationCode: String): Int {
        BLUE_LINE.forEach{
            if(it.code==destinationCode) {
                println("Destination: " + it.name)
                println("Line: Blue")
                println("")
                return BLUE_LINE.indexOf(it)
            }
        }
        return -1
    }

