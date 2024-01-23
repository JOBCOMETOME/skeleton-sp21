package randomizedtest;

import timingtest.AList;


/**
 * Created by hug.
 */
public class TestBuggyAList {
  // YOUR TESTS HERE
    public static void main(String[] args) {
        TestBuggyAList testBuggyAList= new TestBuggyAList();
        testBuggyAList.testThreeAddThreeRemove();

    }
    public void testThreeAddThreeRemove(){
        BuggyAList<Integer> buggyAList = new BuggyAList<>();
        buggyAList.addLast(4);
        buggyAList.addLast(5);
        buggyAList.addLast(6);
        AList<Integer> aList = new AList<>();
        aList.addLast(4);
        aList.addLast(5);
        aList.addLast(6);
        for(int i = 0 ; i < aList.size();i++){
            System.out.println(aList.get(i));
        }
        for(int i = 0 ; i < buggyAList.size();i++){
            System.out.println(buggyAList.get(i));
        }
        buggyAList.removeLast();

        aList.removeLast();

        for(int i = 0 ; i < aList.size();i++){
            System.out.println(aList.get(i));
        }
        for(int i = 0 ; i < buggyAList.size();i++){
            System.out.println(buggyAList.get(i));
        }
    }
}
