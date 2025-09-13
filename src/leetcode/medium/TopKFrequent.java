/* 
https://leetcode.com/problems/top-k-frequent-elements/
*/

package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Pair implements Comparable<Pair> {

	Integer Key;
	Integer value;

	public Integer getKey() {
		return Key;
	}

	public void setKey(Integer key) {
		Key = key;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "[K = " + getKey() + ", V = " + getValue() + "]";

	}

	@Override
	public int compareTo(Pair pair) {
		// TODO Auto-generated method stub
		return Integer.compare(pair.getValue(), this.getValue());
	}

}

public class TopKFrequent {

	public static int[] topKFrequent(int[] nums, int k) {

		HashMap<Integer, Integer> numsMap = new HashMap<Integer, Integer>();

		for (int num : nums) {
			if (!numsMap.containsKey(num)) {
				numsMap.put(num, 1);
			} else {
				numsMap.put(num, numsMap.get(num) + 1);
			}
		}

		List<Pair> pairList = new ArrayList<Pair>();

		for (Map.Entry<Integer, Integer> entry : numsMap.entrySet()) {

			Pair pair = new Pair();

			pair.setKey(entry.getKey());
			pair.setValue(entry.getValue());

			pairList.add(pair);
		}

		Collections.sort(pairList);

		int[] frecuent = new int[k];

		for (int i = 0; i < frecuent.length; i++) {
			frecuent[i] = pairList.get(i).getKey();
		}

		return frecuent;
	}

	public static void main(String[] args) {

		int[] nums = { 4, 1, -1, 2, -1, 2, 3 };
		int k = 2;

		int result[] = topKFrequent(nums, k);

		System.out.println(Arrays.toString(result));
	}

}
