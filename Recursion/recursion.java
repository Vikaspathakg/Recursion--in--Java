package Recursion;
import java.util.ArrayList;
import java.util.Scanner;
public class recursion {
    //Qus:17: Given an Array of size N and an integer X. The task is to Return all the indices as ArrayList if X exist in the Array!!

    static ArrayList<Integer>allIndices(int[] a,int n,int target,int idx){
        // Base case
        if(idx>=n){
            return new ArrayList<Integer>();//Return an empty Arraylist
        }

        ArrayList<Integer>ans = new ArrayList<>();

        // Self work
        if (a[idx] == target) {
            ans.add(idx);

        }

        // Recursive work

        ArrayList<Integer>smallAns = allIndices(a,n,target,idx+1);
        ans.addAll(smallAns);
        return ans;
    }



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr = {4,5,4,4,6,7};
            int target = 4;
            int idx = 0;
//            findIndices(arr,arr.length,target,idx);
            ArrayList<Integer> ans = allIndices(arr,arr.length,target,idx);
            for(Integer i:ans){
                System.out.println(i);
            }



    }
}


//Qus:17: Given an Array of size N and an integer X. The task is to find all the indices of the integer X in the Array!!

//static void findIndices(int[] a,int n,int target,int idx){
//    // Base case
//    if(idx >= n)return;
//
//    // Self work
//    if(a[idx]==target){
//        System.out.println(idx);
//
//    }
//
//    // Recursive work
//    findIndices(a,n,target,idx+1);
//
//}
//
//
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    int[] arr = {4,5,4,4,6,7};
//    int target = 4;
//    int idx = 0;
//    findIndices(arr,arr.length,target,idx);
//
//
//
//}
//}

//Qus:16: Given an Array of n integers and a target value x. Return index if x exists in the Array!!

//static int search(int[] a,int n,int target,int idx){
//    // Base case
//    if(idx == n)return -1;
//
//    // Self work
//    if(a[idx]==target)return idx;
//
//    // Recursive work
//    return search(a,n,target,idx+1);
//
//}
//
//
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    int[] arr = {4,5,6,7};
//    int target = 5;
//    int idx = 0;
//    System.out.println(search(arr,arr.length,target,0));
//
//
//
//}
//}

//Qus:15: Given an Array of n integers and a target value x. Print whether x exists in the Array of Not!!

//static boolean search(int[] a,int n,int target,int idx){
//    // Base case
//    if(idx == n)return false;
//
//    // Self work
//    if(a[idx]==target)return true;
//
//    // Recursive work
//    return search(a,n,target,idx+1);
//
//}
//
//
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    int[] arr = {4,5,6,7};
//    int target = 5;
//    int idx = 0;
//    if(search(arr,arr.length,target,idx=0)){
//        System.out.println("Yes");
//    }
//    else {
//        System.out.println("No");
//    }
//
//
//
//}
//}

//Qus:14: Find Sum of element in the Array using Recursion!!

//static int findSumofArray(int[] arr,int idx){//5,6,7,8
//    // Base case
//    if(idx==arr.length)return 0;
//
//    int smallAns = findSumofArray(arr,idx+1);
//
//    return smallAns + arr[idx];
//
//}
//
//
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    int[] arr = {4,5,6,7};
//    System.out.println(findSumofArray(arr,0));
//
//
//}
//}

//Qus:13: Find maximum element in the Array using Recursion!!

//static int findMaxofArray(int[] arr,int idx){//5,6,7,8
//    // Base case
//    if(idx==arr.length-1)return arr[idx];
//
//    int smallAns = findMaxofArray(arr,idx+1);
//
//    return Math.max(smallAns,arr[idx]);
//
//}
//
//
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    int[] arr = {4,5,6,7};
//    System.out.println(findMaxofArray(arr,0));
//
//
//}
//}

//Qus:12: Print the array using Recursion!!

//static void printArray(int[] arr,int idx){
//    // Base case
//    if(idx==arr.length)return;
//
//    // Self work
//    System.out.println(arr[idx]);
//
//    // Recursive work
//    printArray(arr,idx+1);
//}
//
//
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    int[] arr = {4,5,6,7};
//    printArray(arr,0);
//
//}
//}

//Qus:11: Find GCD using Recursion!!

//static int iGcd(int x,int y){
//    if(y==0)return x;
//
//    return iGcd(y,x%y);
//
//}
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter  x :");
//    int x = sc.nextInt();
//    System.out.println("Enter y :");
//    int y = sc.nextInt();
//    System.out.println(iGcd(x,y));
//}
//}

//Qus:11: Find GCD using brute force approach!!

//static int iGcd(int x,int y){
//    while(x%y!=0){
//        int rem = x%y;
//        x = y;
//        y = rem;
//
//    }
//    return y;
//}
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter  x :");
//    int x = sc.nextInt();
//    System.out.println("Enter y :");
//    int y = sc.nextInt();
//    System.out.println(iGcd(x,y));
//}
//}


//Qus:11: Given a Number n find the sum of Natural numbers till n but alternate signs.!!
//That means if n=5 then you have to return 1-2+3-4+5=3 as your answer!!

//static int printseriesSum(int n){
//    if(n==0)return 0;
//    if(n%2==0){
//        return   printseriesSum(n-1)-n;
//    }
//    else{
//        return printseriesSum(n-1)+n;
//    }
//}
//
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter  n :");
//    int n = sc.nextInt();
//    System.out.println(printseriesSum(n));
//
//}
//}


//Qus:10: Given a Number num and a value k.Print k multiples of num!!

//static void printMultiple(int n,int k){
//    if(k==1){
//        System.out.println(n);
//        return;
//    }
//    // Recursive work
//    printMultiple(n,k-1);
//
//    // Self work
//    System.out.println(n*k);
//}
//
//
//
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter  n :");
//    int n = sc.nextInt();
//    System.out.println("Enter k :");
//    int k = sc.nextInt();
//    printMultiple(n,k);
//
//
//
//}
//}


//Qus:9: Find out a raised to the power b !!-> Method 02


//static int findPower(int n,int q){
//    if(q==0)return 1;
//    int smallproblem = findPower(n,q/2);
//    if(q%2==0){
//        return smallproblem*smallproblem;
//    }
//    return n*smallproblem*smallproblem;
//}
//
//
//
//
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter a base :");
//    int n = sc.nextInt();
//    System.out.println("Enter exponent :");
//    int e = sc.nextInt();
//    System.out.println(findPower(n,e));
//
//
//}
//}

//Qus:8: Find out a raised to the power b !!

//static int findPower(int n,int q){
//    if(q==0)return 1;
//    return findPower(n,q-1)*n;
//}
//
//
//
//
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter a base :");
//    int n = sc.nextInt();
//    System.out.println("Enter exponent :");
//    int e = sc.nextInt();
//    System.out.println(findPower(n,e));
//
//
//}
//}

//Qus:7: Given an integer,Count the Number of digits !!

//static int findSumOfDigits(int n){
//    // Base case
//    if(n>=0 && n<=9){
//        return 1;
//    }
//    return findSumOfDigits(n/10) + 1;
//
//}
//
//
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter a Number :");
//    int n = sc.nextInt();
//    int ans = findSumOfDigits(n);
//    System.out.println(ans);
//}
//}

//Qus:6: Given an integer,find out the sum of digits !!

//static int findSumOfDigits(int n){
//    // Base case
//    if(n>=0 && n<=9){
//        return n;
//    }
//    return findSumOfDigits(n/10) + n%10;
//
//}
//
//
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter a Number :");
//    int n = sc.nextInt();
//    int ans = findSumOfDigits(n);
//    System.out.println(ans);
//}
//}



//Qus:5: Print nth Fibonacci Series using recursion only!!

//static int printFibonacci(int n){
//    if(n==0 || n==1){//Base case
//        return n;
//    }
//    //Self work-Recursive work
//    int previous = printFibonacci(n-1);
//    int preprevious = printFibonacci(n-2);
//
//    int Ans = previous + preprevious;
//
//    return Ans;
//}
//
//
//
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter a Number :");
//    int n = sc.nextInt();
//    for(int i = 0; i <=n; i++) {
//        System.out.println(printFibonacci(i));
//    }
//
//}
//}


//Qus:4: Print Fibonacci Number using recursion only!!

//static int printFibonacci(int n){
//    if(n==0 || n==1){//Base case
//        return n;
//    }
//    //Self work-Recursive work
//    int previous = printFibonacci(n-1);
//    int preprevious = printFibonacci(n-2);
//
//    int Ans = previous + preprevious;
//
//    return Ans;
//}
//
//
//
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter a Number :");
//    int n = sc.nextInt();
//    int Ans = printFibonacci(n);
//    System.out.println("The "+n+" Fibonacci number is "+Ans);
//}
//}

//Qus:3: Print Factorial using recursion only!!

//static int printFactorial(int n){
//    if(n==0){
//        return 1;
//    }
//    return n*printFactorial(n-1);
//}
//
//
//
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter a Number :");
//    int n = sc.nextInt();
//    int Ans = printFactorial(n);
//    System.out.println("The factorial of "+n+" is "+Ans);
//}
//}


//Qus:2: Print n to 1 using Recursion!!

//static void printDecreasin(int n){//5,4,3,2,1
//    //Base case
//    if(n==1){
//        System.out.println(n);
//        return;
//    }
//    //self work
//    System.out.println(n);
//    //Recursive work
//    printDecreasin(n-1);
//
//
//}
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter a Number :");
//    int n = sc.nextInt();
//    printDecreasin(n);
//
//}
//}

//Qus:1: Print 1 to n using Recursion!!

//static void printIncreasin(int n){//1,2,3,4,5
//    //Base case
//    if(n==1){
//        System.out.println(n);
//        return;
//    }
//    //Recursive work
//    printIncreasin(n-1);
//    //self work
//    System.out.println(n);
//
//}
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter a Number :");
//    int n = sc.nextInt();
//    printIncreasin(n);
//
//}
//}
