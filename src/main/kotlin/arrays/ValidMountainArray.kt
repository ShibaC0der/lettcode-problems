package arrays

object ValidMountainArray {
    fun validMountainArray(arr: IntArray): Boolean {
        if (arr.size < 3) return false
        var i = 1
        while (i < arr.size && arr[i] > arr[i - 1]) {
            i++
        }
        if (i == arr.size || i == 1) return false
        while (i < arr.size && arr[i] < arr[i - 1]) {
            i++
        }
        return i == arr.size
    }
}
