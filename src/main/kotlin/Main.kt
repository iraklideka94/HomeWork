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


//3. მოცემულია მასივი, რომელიც შედგება მთელი რიცხვებისგან. დაწერეთ ფუნქცია რომელსაც
//გადაეცემა ეს მასივი და აბრუნებს მინიმალურ მთელ რიცხვს, რომელიც 0-ზე მეტია და ამ მასივში
//არ შედის.
//Int notContains(Int[] array);

fun notContains(array: IntArray): Int {
    val set = HashSet<Int>()
    for (i in array.indices) {
        set.add(array[i])
    }
    for (i in 1..Int.MAX_VALUE) {
        if (!set.contains(i)) {
            return i
        }
    }
    return -1
}

//5. გვაქვს n სართულიანი კიბე, ერთ მოქმედებაში შეგვიძლია ავიდეთ 1 ან 2 საფეხურით. დაწერეთ
//ფუნქცია რომელიც დაითვლის n სართულზე ასვლის ვარიანტების რაოდენობას.
//Int countVariants(Int stearsCount);

fun countVariants(stepsCount: Int): Int {
    if (stepsCount <= 2) {
        return stepsCount
    }
    var prev = 1
    var current = 2
    for (i in 3..stepsCount) {
        val next = prev + current
        prev = current
        current = next
    }
    return current
}

