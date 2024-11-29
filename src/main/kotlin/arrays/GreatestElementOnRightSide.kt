package arrays

object GreatestElementOnRightSide {
    fun replaceElements(arr: IntArray): IntArray {
        var max = -1
        for(i in (arr.lastIndex downTo 0)){
            val el = arr[i]
            arr[i] = max
            max = maxOf(max, el)
        }
        return arr;
    }
}
