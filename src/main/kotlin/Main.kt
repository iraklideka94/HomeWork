fun main(args: Array<String>) {


}


//1. გვაქვს მთელი რიცხვების ჩამონათვალი სადაც  ერთის გარდა ყველა რიცხვი მეორდება, იპოვეთ
//ის რიცხვი რომელიც არ მეორდება.int singleNumber(int[] nums)

fun singleNumber(nums: IntArray): Int {
    var result = 0
    for (i in nums.indices) {
        result = result xor nums[i]
    }
    return result
}
