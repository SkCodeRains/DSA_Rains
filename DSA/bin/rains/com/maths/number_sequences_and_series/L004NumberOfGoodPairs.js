/**
 * @param {number[]} nums
 * @return {number}
 */
var numIdenticalPairs = function (A) {
    let ans = 0;
    cnt = [];

    for (const a of A) {
        ans += cnt[a]++;
    }
    return ans;
};

function test() {
    nums = [1, 2, 3, 1, 1, 3]
    pairs = numIdenticalPairs(nums);
    console.log(pairs);
}

test();