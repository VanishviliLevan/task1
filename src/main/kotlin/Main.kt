fun main(args: Array<String>) {

    fun arrayCalculator(arr:IntArray):Int{
        if (arr.size <2){
            return 0
        }
        else{
            var sum:Int = 0
            var i = 2
            while(i<arr.size){
                sum += arr[i]
                i += 2
            }
            return sum
        }

    }

    val arr = intArrayOf(1, 5,4,12,11,23,26)
    println(arrayCalculator(arr))


    fun palin(txt:String):Boolean{



        if(txt == txt.reversed()){

            return true

        }



        return false



    }



    println( palin("hey"))



    println(palin("asa"))


}