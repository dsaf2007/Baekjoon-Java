package week1;

import com.google.common.collect.Sets;

import java.util.*;

public class IntersectionTest {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,7,4,9};
        int[] arr2 = {3,4,5,7,8,8,10,11};

        List<Integer> result = getList(arr1, arr2);

        for(Integer r : result){
            System.out.print(r + " ");
        }
    }

    public static List<Integer> getList(int[] a, int[] b){
        List<Integer> result = new ArrayList<>();

        Set<Integer> aSet = new HashSet<>();
        Set<Integer> bSet = new HashSet<>();

        for(int i : a){
            aSet.add(i);
        }

        for(int i : b){
            bSet.add(i);
        }

        Set<Integer> intersection = Sets.intersection(aSet, bSet);

        for(Integer i : intersection){
            result.add(i);
        }
        return result;
    }
}
