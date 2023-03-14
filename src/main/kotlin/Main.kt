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


//2. გვაქვს 1,5,10,20 და 50 თეთრიანი მონეტები. დაწერეთ ფუნქცია, რომელსაც გადაეცემა თანხა
//(თეთრებში) და აბრუნებს მონეტების მინიმალურ რაოდენობას, რომლითაც შეგვიძლია ეს თანხა
//დავახურდაოთ.
Int minSplit(Int amount);
fun minSplit(amount: Int): Int {
    val coins = intArrayOf(50, 20, 10, 5, 1)
    var numCoins = 0
    var remainingAmount = amount
    for (i in coins.indices) {
        numCoins += remainingAmount / coins[i]
        remainingAmount %= coins[i]
    }
    return numCoins
}



