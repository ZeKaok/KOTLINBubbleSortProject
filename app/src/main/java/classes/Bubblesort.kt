package classes

class Bubblesort(arr:IntArray) {


    fun Bubblesort(){

    }
    fun BubbleSort( arr : IntArray):IntArray{
        var size = arr.size
        for(i in 0 until size-1){
            for (j in 0 until size-i-1){
                if(arr[j]>arr[j+1]){
                    var temp:Int
                    temp=arr[j]
                    arr[j]=arr[j+1]
                    arr[j+1]=temp
                }
            }
        }

        return arr;
    }
}