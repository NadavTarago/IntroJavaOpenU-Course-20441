 // Written by Nadav Taragan. 
 /** Exam 2007a b1 Question#1 **/ // - Nadav Taragan (tarago)
    public static int equalSum() {
        int[] arr = new int[] {1,5,6,12};
    if (equalSum(arr, 0, 0) >= arr.length) // if the answer is the sum of the array- return -1
        return -1; 
    else
        return equalSum(arr, 0, 0); // means it found answer.
} 

                /** Exam 2007a b1 Question#1 **/  // - Nadav Taragan (tarago)
    private static int equalSum(int[] arr, int i, int sum) {
            if (i == arr.length) 
                return sum; 

    

            if (equalSum(arr, i+1,sum+arr[i]) / 2 == sum )
                return i-1;
            else 
                return equalSum(arr, i+1,sum + arr[i]) ;


    } 

	--------------------------------------------------------------------------------------------------------------------------------------------------------------

     /** Exam 2013b  83 a3 Question#1 **/ // - Nadav Taragan (tarago)
    public static boolean balancedPartition (int[] arr) {
        if (arr == null || arr.length == 0 || arr.length %2 != 0) 
            return false; 
        if (sumArr(arr, 0) %2 != 0)
            return false; 
        int half = sumArr(arr, 0)/ 2;


        return balancedPartition(arr, 0, 0, 0,0,0, half);

   }
     /** Exam 2013b  83 a3 Question#1 **/ // - Nadav Taragan (tarago)
    private static boolean balancedPartition (int[] arr, int i, int a, int aSize, int b, int bSize, int half) {
        if (i == arr.length)
            if ( a==b && aSize == half)
                return true;
            else 
                return false;


        return (balancedPartition (arr, i+1,a+1, aSize + arr[i],b, bSize, half) ||balancedPartition (arr, i+1,a, aSize,b+1, bSize+ b+arr[i], half));
    }
         /** Exam 2013b  83 a3 Question#1 **/ // - Nadav Taragan (tarago)
    private static int sumArry (int[] arr, int i) {
        if (i == arr.length)
            return 0; 
        return arr[i] + sumArry(arr, i +1); 

    }
	 --------------------------------------------------------------------------------------------------------------------------------------------------------------
/** Exam 2013b b3 92 question #1 **/ // - Nadav Taragan (tarago)
public static int longestFlat (int[] a) {
    return longestFlat(a, 0, 1, 1,0);
}

/** Exam 2013b b3 92 question #1 **/ // - Nadav Taragan (tarago)
private static int longestFlat(int[] a, int i, int j, int maxTemp, int max){
    if (maxTemp > max)
        max = maxTemp;
    if (i == a.length -1)
        return max;
    if (j == a.length)
        return longestFlat(a, i+1,i+2, 0, max);

    if ( a[j] == a[i]|| Math.abs(a[i] - a[j]) == 1)
        return longestFlat( a, i,j+1, maxTemp+1, max);

    else
        return longestFlat( a, i+1,i+2, 0,max) ;    
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------
/** Exam 2013b b3 92 question #2 **/ // - Nadav Taragan (tarago)
	// Also appeared in Exam 2018a Moaaed b! !
	//** time: O(n). k considered as final!!! 
	public static int sortMod (int[] arr, int k) {

	int curr = 0;
	int temp;


	for (int thisStage= 0; thisStage<k; begin+) {
		for (int now = curr; now < arr.length; now++) 
		{
			if (arr[now] == thisStage)
			{
				temp = arr[curr]
				arr[curr] = arr[now];
				arr[now] = temp; 
				cur++;
			}
		
		
		}
	}


}
	
	--------------------------------------------------------------------------------------------------------------------------------------------------------------

 /** Exam 2014b a4 85 Question#1     **/ // - Nadav Taragan (tarago)
    public static int longestWorm (int[][] mat) {
        
        return longestWorm2(mat, 0, 0,0);
        
       
    }
    
        /** Exam 2014b a4 85 Question#1     **/ // - Nadav Taragan (tarago)
    public static int longestWorm2 (int[][] mat, int i, int j, int tempMax){ // try all the worms in the mat. 
        
        if ( j == mat[0].length)
            return tempMax; 
        if (i >= mat.length)
                return longestWorm2(mat, 0, j+1, tempMax); 

        
        if (longestWorm(mat, i, j, mat[i][j] -1) > tempMax)
            tempMax= longestWorm (mat, i, j, mat[i][j] -1);
            
        return longestWorm2(mat, i+1, j, tempMax);
        
        
    }
    /** Exam 2014b a4 85 Question#1     **/ // - Nadav Taragan (tarago)
    public static int longestWorm (int[][] mat, int i,int j, int num) { // return the length longest worm that from given index.
        
        if (i < 0 || j < 0 || i >= mat.length || j>= mat[0].length || num +1 != mat[i][j])  // 
            return 0;

         int res1,res2,res3,res4;
        
            
        res1 = 1 + longestWorm (mat, i-1, j, mat[i][j]);
        res2 = 1 + longestWorm (mat, i+1, j, mat[i][j]);
        res3 = 1 + longestWorm (mat, i, j-1, mat[i][j]);
        res4 = 1 + longestWorm (mat, i, j+1, mat[i][j]);
        
        int max = Math.max(Math.max(res1,res2),Math.max(res3, res4));
        
        return max;
  } 
  
	 --------------------------------------------------------------------------------------------------------------------------------------------------------------
    /** Exam 2015a b2 91 question #1 **/ // - Nadav Taragan (tarago)

public static int makeSum(int[] lengths, int k, int num) {
    return makeSum(lengths, 0, k, num);
    
    
    
    
}
/** Exam 2015a b2 91 question #1 **/ // - Nadav Taragan (tarago)
private static int makeSum(int[] lengths,int i, int k, int num) {
    if (num ==0)
        return 1; 
    if (k== 0 || i == lengths.length)
        return 0;
     return makeSum(lengths, i, k-1, num-lengths[i]) + makeSum(lengths, i+1, k, num);
    }



/** Exam 2015b a5 86 question #2 **/ // - Nadav Taragan (tarago)

public static void printParirs (int[] a, int k) {
 int i = 0;
 int j = 1;
 
 while (j< a.length) {
     if (a[j] - a[i] ==k) {
        System.out.println("Pairs found: ("+ a[i]+","+a[j]+")");
        i++;
        j++;
        
        }
     else if  (a[j] - a[i] < k)
        j++;
     else if (a[j] -a[i] > k && i +1 < j)
        i++;
     else {
         i = j;
         j++;
     
     
    }
}
}
	--------------------------------------------------------------------------------------------------------------------------------------------------------------

    /** Exam 2015a 89 Question#1 **/  // - Nadav Taragan (tarago)
    public static boolean splitEqualMult(int[] a) {
        double root = Math.sqrt(dup(a, 0); 
        return
            splitEqualMult(a, 0, 1, root);
        }
          /** Duplicate each number in the array**/
    private static int dup (int[] arr, int i{
	if (i == arr.length)
		return 1; 
	return arr[i] * dup(arr, i+1);

}     


        /** Exam 2015a 89 Question#1 **/  // - Nadav Taragan (tarago)
    private static boolean splitEqualMult (int[] a, int i , int sum, double root){
        if (sum==root)
            return true;
        if (i== a.length)
            return false; 
        if (splitEqualMult(a, i+1, sum,root) || splitEqualMult(a, i+1, sum*a[i], root))
            return true;
        else 
            return false;
    }
	
	
	 --------------------------------------------------------------------------------------------------------------------------------------------------------------
	     /** Exam 2015a  a2 83 Question#1 Return the shortest length to the legal path to the last index**/  // - Nadav Taragan (tarago)
	

public static int shortestPath (int[][] mat) {

	return shortestPath (mat, 0, 0, 0); 
}

	     /** Exam 2015a  a2 83 Question#1 Return the shortest length to the legal path to the last index**/  // - Nadav Taragan (tarago)

private static int shortestPath (int[][] mat, int i, int j,int prev) {

	if (j == mat[0].length-1 && i == mat.length-1)
		return 0; // הגענו ליעד
	if (j < 0 || i < 0 || i == mat.length || j == mat[0].length || mat[i][j] <= prev)
		return i*j; // אם הצעד לא תקין , תחזיר מספר גבוהה יותר משיכול להתקבל כשנתון שיש לפחות תוצאה אחת נכונה.


	int up =1+ shortestPath(mat, i, j-1, mat[i][j]);
	int down = 1+ shortestPath (mat, i, j+1, mat[i][j]);
	int right = 1+ shortestPath (mat, i-1,j, mat[i][j]);
	int left = 1+ shortestPath (mat, i+1, j, mat[i][j]);


	return Math.min(Math.min(up,down),Math.min(right,left));

}
			    
			    
	--------------------------------------------------------------------------------------------------------------------------------------------------------------		    
	     /** Exam 2015a  a4 Question#1 Count how many ropes are in the array**/  // - Nadav Taragan (tarago)
    public static int countRopes (int[][] mat){
     if (mat == null)
        return -1;
     return countRopesFindIndex ( mat,  0);  
    }
        /** Exam 2015a  a4 Question#1 **/  // - Nadav Taragan (tarago)
    private static int countRopesFindIndex (int[][] mat, int i){
        if (i == mat.length)
            return 0;
        int sum = countRopes (mat, i, 0, Integer.MAX_VALUE);      
        
        return countRopesFindIndex(mat, i+1) + sum ;
        
        
    } 
        /** Exam 2015a  a 4 Question#1 **/  // - Nadav Taragan (tarago)
    private static int countRopes ( int[][] mat, int i, int j, int perv){
        if (i ==mat.length || j==mat[0].length || i == -1) 
            return 0;
        if (mat[i][j] >= perv)
            return 0; 
        
        if (j == mat[0].length -1 && mat[i][j] < perv && mat[i][j] != 0) 
            return 1; 
            
        return countRopes (mat, i, j+1, mat[i][j]) +
               countRopes (mat, i-1, j+1, mat[i][j]) +  
               countRopes (mat, i+1, j+1, mat[i][j]) ;
        
            
        
    }
	
		 --------------------------------------------------------------------------------------------------------------------------------------------------------------

/** Exam 2015b b5 question #1 **/ // - Nadav Taragan (tarago)
public static int longOrdNum(String s) {
if ( s == null|| s.length()==0 )
    return 0;
return  longOrdNum(s, 0,0,0,'0');

}
/** Exam 2015b b5 question #1 **/ // - Nadav Taragan (tarago)
private static int longOrdNum(String s, int i, int sum, int max, int prev){
    if(sum>max)
        max = sum;

    if(i==s.length())
        return max;
    if(s.charAt(i) > '9')
        return longOrdNum(s, i+1, 0,max, -1); 
    if (s.charAt(i) <= '9' && s.charAt(i) >prev)
        return longOrdNum(s, i+1, sum+1, max,s.charAt(i)); 
    else 
        return longOrdNum(s,i+1, 1, max,s.charAt(i));
}


	 --------------------------------------------------------------------------------------------------------------------------------------------------------------
	/** Exam 2015b a5 86 question #1 **/ // - Nadav Taragan (tarago)
public static void printAllSum (int[] a, int sum) {
    String s = "";
     printAllSum(a, sum, 0, s);

}

/** Exam 2015b a5 86 question #1 **/ // - Nadav Taragan (tarago)
private static void printAllSum (int[] a, int sum, int i, String s) {
    if (sum == 0 && i == a.length) {
        System.out.println (s); 
        return;
    }
    else if (i == a.length)
        return;
    String s1 = s+'0';
    printAllSum(a, sum, i+1, s1);
    String s2 = s+'1';
    printAllSum(a,sum-a[i], i+1, s2);

} 
--------------------------------------------------------------------------------------------------------------------------------------------------------------



	/** Exam 2016b  a6 Question#1 **/  // - Nadav Taragan (tarago)
    public static int count (int sum){
        int[] arr = new int[sum];
        installArr (arr, sum);

        return count(arr,0,sum);

    }
                /** Exam 2016b  a6 Question#1 **/  // - Nadav Taragan (tarago)
    private static void installArr (int[] arr, int sum) {
	if (sum == 0)
		return;
	arr[sum-1] = sum;
    	installArr(arr, sum-1); 
    }
                /** Exam 2016b  a6 Question#1 **/  // - Nadav Taragan (tarago)
    private static int count (int[] arr, int i, int sum){
        if (sum == 0)
            return 1; 
        if (i == arr.length)
            return 0; 
	return count(arr, i+1, sum- arr[i]) + count(arr, i+1, sum);
    }
	--------------------------------------------------------------------------------------------------------------------------------------------------------------
            /** Exam 2016a  a6 Question#1 **/  // - Nadav Taragan (tarago)
    public static int minDiff (int[] arr) { // the metthod return the minimal possible diffrent between two groups of the array; 
            return minDiff(arr,0,0,0);

    }
            /** Exam 2016a  a6 Question#1 **/ // the metthod return the minimal possible diffrent between two groups of the array;  // - Nadav Taragan (tarago)
		if (i == a.length)
    private static int minDiff (int[] arr, int i, int sum1, int sum2) {
            if(i == arr.length)
                return Math.abs(sum2-sum1);
            
            return Math.min(minDiff(arr,i+1, sum1+arr[i],sum2),minDiff(arr,i+1, sum1,sum2+arr[i]));
    }
--------------------------------------------------------------------------------------------------------------------------------------------------------------

	    /** Question #1 2016a a2 83 OpenU **/ // - Nadav Taragan (tarago)
    public static int minPoints (int[][] m) {
        if (minPoints(m, 0,0, 0, 0) <0)
            return Math.abs(minPoints(m, 0,0, 0, 0)) + 1;
        else
        return minPoints(m, 0,0, 0, 0);
        
    }
    /** Question #1 2016a a2 83 OpenU **/ // - Nadav Taragan (tarago)
    private static int minPoints (int [] [] m, int i, int j, int sum, int min) {
        sum+= m[i][j];
        if (sum < min)
            min = sum;
        if (i == m.length -1 && j == m[0].length-1) {
            if (min > 0)
                return 1;
            else 
            return min; 
        }
            
        if (i< m.length -1 && j < m[0].length-1)
            return minPoints(m, i+1, j, sum,min) > minPoints(m, i, j+1, sum, min) ? minPoints(m, i+1, j, sum,min) : minPoints(m, i, j+1, sum, min); 
        if ( i< m.length -1)
            return minPoints(m, i+1, j, sum,min);
        else 
            return minPoints(m, i, j+1, sum, min);
    }
    
	--------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	
	/** Exam 2017a a5 86 question #1 **/ // - Nadav Taragan (tarago)
public static int edit (String str1, String str2) {
        return edit(str1, str2, 0, 0);
}

/** Exam 2017a a5 86 question #1 **/ // - Nadav Taragan (tarago)
private static int edit (String str1, String str2, int ist1, int ist2) {
    if (ist1 == str1.length() && ist2 == str2.length())
        return 0; 
    if ( ist1 == str1.length() || ist2 == str2.length())
        return (str1.length() -ist1) + (str2.length() - ist2) ;
        
    if ( str1.charAt(ist1) == str2.charAt(ist2)) 
        return edit (str1, str2, ist1+1, ist2+1);

    int st1 = 1 + edit(str1,str2, ist1+1, ist2);
    int st2 = 1 + edit(str1, str2, ist1, ist2+1); 
    
    
    return Math.min(st1,st2);

}
	--------------------------------------------------------------------------------------------------------------------------------------------------------------


/** Exam 2017b a3 question #1 **/ // - Nadav Taragan (tarago)
public static int ways (int n, int k) {
    return ways(n, k, 0);

}

/** Exam 2017b a3 question #1 **/ // - Nadav Taragan (tarago)
private static int ways (int n, int k, int curr) {
    if (k==0 && n==curr)
        return 1; 
    if (k==0)
        return 0; 

return ways(n, k-1, curr +1) + ways(n, k-1, curr-1);  
    

}
			    
	
	--------------------------------------------------------------------------------------------------------------------------------------------------------------
		/** Exam 2017a a5 86 question #1 **/ // - Nadav Taragan (tarago)
	    
	public static int edit (String str1, String str2) {

	return edit (str1, 0, str2, 0);
}
		/** Exam 2017a a5 86 question #1 **/ // - Nadav Taragan (tarago)


private static int edit (String str1, int s1, String str2, int s2) {
	if (s1 == str1.length() && s2 == str2.length())
		return 0;
	if (s1 == str1.length())
	   return str2.length() - str1.length(); 
	if (s2 == str2.length()) 
	   return str1.length() - str2.length(); 
	   
	if (str1.charAt(s1) == str2.charAt(s2)) 
		return edit(str1, s1+1, str2, s2+1); 
	int add =1+ edit(str1, s1, str2, s2+1); 
	int remove =1+ edit(str1, s1+1, str2, s2);
	
	return Math.min(add, remove); 
	
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------

    public static int oneFiveSeven (int num) { // what is the minumum actions we need to do to make a number by the options : add 1, add 5, add 7?  // - Nadav Taragan (tarago)
        if (num == 0)
            return 0;
        if (num < 0)
            return Integer.MIN_VALUE; 
        int s1 = 1 + oneFiveSeven(num -1);
        int s5 = 1 + oneFiveSeven(num-5);
        int s7 = 1 + oneFiveSeven (num -7);
        
        int min = s1;
        if (s5 < min && s5 >= 0)
            min = s5;
        if (s7< min && s7 >= 0)
            min = s7;
        if (min >= 0)
            return min;
        else 
            return -1;
    
--------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	/** Exam 2018a ?? question #1 **/
	
	public static int sorted (int n ,int max){
 if (n == 0 || max == 0){
     return 0;
    }
    return sorted(n,max,1);
}
private static int sorted (int n ,int max, int curr) {
 if (curr > max){
 return 0;
}
 if (n == 0) {
 return 1;
}
return 
sorted(n-1, max, curr)  + sorted(n, max, curr+1) ;
}
}

