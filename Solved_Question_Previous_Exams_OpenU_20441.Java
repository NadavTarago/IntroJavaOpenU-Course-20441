
// following Nadav's codes you can find other solutions by other students. 


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
     /** Exam 2009b  96 b6 Question#1 **/  // by Nadav Taragan (Tarago) 
public static boolean samePattern (String s1, String s2) {
    return samePattern(s1, 0, s2, 0); 
}

     /** Exam 2009b  96 b6 Question#1 **/  // by Nadav Taragan (Tarago) 
private static boolean samePattern (String s1, int i1, String s2, int i2) {



if (i1 == s1.length() && i2 == s2.length() || i1 == s1.length() && s2.charAt(s2.length()-1)== '*') // if we in the end of the strings, or if we in the end of String1, but not in String2, but we are in the last index of String2 and there is '*' there. we can return true.
    return true; 

if (i1 == s1.length() || i2 == s2.length()) // if we are in the end of one of the Strings and the first condition didn't return us true, so return false.
    return false; 


if (s1.charAt(i1) == s2.charAt(i2)) // if so, we can pass to the next char in the String. 
    return samePattern(s1, i1+1, s2, i2+1);
if (s1.charAt(i1) != s2.charAt(i2) && s2.charAt(i2) != '*') // it means we got into 'deadend' - return false.
    return false;

    // try 2 steps - or use the "joker" or stop use it. 
return samePattern(s1, i1+1, s2, i2+1) || samePattern(s1, i1+1, s2, i2);

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
	public static void sortMod (int[] arr, int k) {

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
--------------------------------------------------------------------------------------------------------------------------------------------------------------
	    
	    
     /** Exam 2018a  b91 Question#1 **/  // by Nadav Taragan (Tarago) 
	    
	    public static int chepastRoute (int[] stations) { 
    return chepastRoute(stations, 0);
}
     /** Exam 2018a  b91 Question#1 **/  // by Nadav Taragan (Tarago) 

private static int chepastRoute (int[] stations, int i)   {
    if (i > stations.length -1)
        return sumArry(stations, 0); // if we out of index- return the sum of the the array. (it must be higher than the correct option and will never be return to the user) 
    if (i == stations.length -1) 
        return stations[stations.length -1]; 
    if (i == stations.length -2) 
        return chepastRoute (stations, i+1) + stations[stations.length -2];

    int opt1 = stations[i] + chepastRoute(stations, i+1); 
    int opt2 = stations[i] + chepastRoute(stations, i+2); 

    return (opt1 > opt2 ? opt2: opt1);

}
     /** Exam 2018a  b91 Question#1 **/  // by Nadav Taragan (Tarago) 

private static int sumArry (int[] arr, int i) {
   if (i == arr.length) 
        return 0;
        
   return arr[i] + sumArry (arr, i+1); 
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------	    
/** Exam 2018a  b91 Question#2 **/  // by Nadav Taragan (Tarago) 

//** time: O(n). k considered as final!!! 
	public static void sortMod (int[] arr, int k) {

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
    }
The following codes written by @ishayhil

/**
 * OpenUniversity old intoToCs exams solved questions.
 *
 * @author Ishay Hilzenrat
 */
public class OldExams {

    // ***************************************** 2018b ************************************************* //
    public static int cntTrueReg(boolean[][] mat) {
        if (mat == null || mat.length != mat[0].length)
            return 0;

        int[][] intM = new int[mat.length][mat.length];

        return cntTrueReg(mat, 0, 0, intM);
    }

    private static int cntTrueReg(boolean[][] mat, int row, int col, int[][] intM) {
        if (!isValidPlace(mat.length, row, col) || intM[row][col] == 1)
            return 0;

        intM[row][col] = 1; // flagging the visited values.

        if (mat[row][col] && row == 0 && col == 0) {
            markT(mat, row, col);
            return 1 + cntTrueReg(mat, row + 1, col, intM) +
                    cntTrueReg(mat, row, col + 1, intM) + cntTrueReg(mat, row + 1, col + 1, intM);
        }

        if (mat[row][col]) {
            markT(mat, row, col);
            return 1;
        }

        return cntTrueReg(mat, row + 1, col, intM) + cntTrueReg(mat, row, col + 1, intM) +
                cntTrueReg(mat, row + 1, col + 1, intM);
    }

    private static boolean markT(boolean[][] m, int row, int col) {
        if (!isValidPlace(m.length, row, col) || !m[row][col])
            return false;

        m[row][col] = false;

        return markT(m, row + 1, col) || markT(m, row - 1, col) ||
                markT(m, row, col + 1) || markT(m, row, col - 1);
    }


    private static boolean isValidPlace(int mLen, int row, int col) {
        return row > -1 && col > -1 && row < mLen && col < mLen;
    }

    // ***************************************** practice ************************************************* //
    public static int sumEven(int n) {
        if (n == 0)
            return 0;

        return ((n % 10) % 2 == 0 ? n % 10 : 0) + sumEven(n / 10);
    }

    // ***************************************** 2017b moed A ************************************************* //

    public static int edit(String s1, String s2) {
        if (s1.length() == 0 || s2.length() == 0)
            return s1.length() + s2.length();

        if (s1.charAt(0) == s2.charAt(0))
            return edit(s1.substring(1), s2.substring(1));

        if (isLetterNeeded(s1.charAt(0), s2)) { // if letter is needed, keep it
            return 1 + edit(s2.charAt(0) + s1, s2);
        }

        return 1 + edit(s1.substring(1), s2); // if letter is not needed, remove it
    }

    private static boolean isLetterNeeded(char c, String s2) {
        if (s2.length() == 0)
            return false;

        if (s2.charAt(0) == c)
            return true;

        return isLetterNeeded(c, s2.substring(1));
    }

    public static int countTriplets(int[] arr, int num) {
        int cnt = 0;
        int low = 0;
        int mid = 1;
        int high = arr.length - 1;

        while (high != mid) { // time comp: O(n^2). while high and low are doing O(n) together, middle is running beside them.
            if (arr[low] + arr[mid] + arr[high] < num) {
                cnt += (high - mid);
                if (mid + 1 != high)
                    mid++;
                else {
                    low++;
                    mid = low + 1;
                }
            } else
                high--;
        }
        return cnt;
    }

    // ***************************************** 2013A moed B ************************************************* //

    public static boolean match(int[] a, int[] pattern) {
        return match(a, pattern, 0, 0, 0);
    }

    private static boolean match(int[] a, int[] pattern, int beginning, int i, int counter) {
        if (pattern.length == 0 || counter == pattern.length)
            return true;

        if (beginning + i > a.length - 1)
            return false;

        if (a[beginning + i] > 9 && a[beginning + i] < 100 && pattern[i] == 2 || a[beginning + i] < 10 && pattern[i] == 1
                || a[beginning + i] < 100 && pattern[i] == 0)
            return match(a, pattern, beginning, i + 1, counter + 1);

        return match(a, pattern, beginning + 1, 0, 0);
    }

    // ***************************************** 2013B moed A ************************************************* //

    public static boolean balancedPartition(int[] arr) {
        int sumToFind = sumArr(arr, 0);
        if (sumToFind % 2 != 0)
            return false;

        return balancedPartition(arr, 0, 0, 0, 0, 0, sumToFind / 2);
    }

    private static boolean balancedPartition(int[] arr, int i, int sumA, int counterA, int sumB, int counterB, int sumToFind) {
        if (arr.length % 2 != 0)
            return false;

        if (i > arr.length - 1) {
            if (counterA == counterB && sumA == sumToFind && sumB == sumToFind)
                return true;
            else
                return false;
        }

        return balancedPartition(arr, i + 1, sumA + arr[i], 1 + counterA, sumB, counterB, sumToFind) ||
                balancedPartition(arr, i + 1, sumA, counterA, sumB + arr[i], counterB + 1, sumToFind);
    }

    private static int sumArr(int[] arr, int ind) {
        if (ind > arr.length - 1)
            return 0;

        return arr[ind] + sumArr(arr, ind + 1);
    }

    // ***************************************** 2013B moed A ************************************************* //

    private static int minPoints(int[][] arr, int sum, int row, int col, int min) {
        sum += arr[row][col];
        if (min > sum)
            min = sum;

        if (row == arr.length - 1 && col == arr[0].length - 1)
            return min;

        if (canIGoRight(arr, col + 1) && canIGoDown(arr, row + 1))
            return max(minPoints(arr, sum, row + 1, col, min), minPoints(arr, sum, row, col + 1, min));

        if (canIGoRight(arr, col + 1))
            return minPoints(arr, sum, row, col + 1, min);

        return minPoints(arr, sum, row + 1, col, min);
    }

    private static boolean canIGoRight(int[][] arr, int col) {
        return col < arr[0].length;
    }

    private static boolean canIGoDown(int[][] arr, int row) {
        return row < arr.length;
    }

    private static int max(int a, int b) {
        if (b > a)
            return b;

        return a;
    }

    public static int minPoints(int[][] arr) {
        return -1 * minPoints(arr, 0, 0, 0, 0) + 1;
    }

    public static boolean findX(int[] arr, int val) { // binary search implementation.
        if (arr == null || arr.length == 1)
            return false;

        int left = 0;
        int right = arr.length - 1;

        while (left != right) { // O(log(n))
            int m = (left + right) / 2;

            if (m - 1 < 0 & arr[m] + arr[m + 1] != val)
                return false;
            if (m + 1 > arr.length - 1 && arr[m] + arr[m - 1] != val)
                return false;

            if (arr[m] + arr[m - 1] == val || arr[m] + arr[m + 1] == val)
                return true;

            if (arr[m] + arr[m - 1] > val)
                right = m - 1;
            else
                left = m + 1;
        }
        return false;
    }

    // ***************************************** 2016A moed A ************************************************* //

    public static int minDiff(int[] arr) {
        return minDiff(arr, sumA(arr, 0, arr.length - 1, 0), 0, arr.length - 1);
    }

    private static int minDiff(int[] arr, int currentMin, int left, int right) {
        int currentD = Math.abs(sumA(arr, left, right, 0) -
                (sumA(arr, 0, left - 1, 0) + sumA(arr, right + 1, arr.length - 1, 0)));

        if (currentD < currentMin)
            currentMin = currentD;

        if (left == right)
            return currentMin;

        return Math.min(minDiff(arr, currentMin, left + 1, right), minDiff(arr, currentMin, left, right - 1));
    }

    private static int sumA(int[] arr, int start, int end, int sum) {
        if (end < 0 || start > arr.length - 1)
            return 0;

        if (start == end)
            return sum + arr[start];

        return sumA(arr, start + 1, end, sum + arr[start]);
    }

    public static int passingCars(int[] arr) { // complexity: O(2n) = O(n)
        // 0 = east
        // 1 = west
        // (a,b) are passing <=> a < b
        if (arr == null)
            return 0;

        int cntWest = countWest(arr); // O(n)
        int total = 0;

        for (int car : arr) { // O(n)
            if (car == 1)
                cntWest--;
            else
                total += cntWest;
        }
        return total;
    }

    private static int countWest(int[] arr) { // O(n)
        int cnt = 0;
        for (int car : arr) {
            if (car == 1)
                cnt++;
        }
        return cnt;
    }

    // ***************************************** 2018A moed A ************************************************* //

    private static int longestSlope(int[][] arr, int row, int col, int num) {
        int nextR = row;
        int nextC = col + 1;
        if (col == arr[0].length) {
            nextC = 0;
            nextR = row + 1;
        }

        if (row == arr.length)
            return 0;

        int thisS = howManyForThis(arr, row, col, num);
        int nextS = longestSlope(arr, nextR, nextC, num);

        return Math.max(thisS, nextS);

    }

    private static int howManyForThis(int[][] arr, int row, int col, int num) {
        int max = 1;
        if (isValidPlace(arr, row, col + 1) && arr[row][col] + num == arr[row][col + 1])
            max = Math.max(max, 1 + howManyForThis(arr, row, col + 1, num));

        if (isValidPlace(arr, row, col - 1) && arr[row][col] + num == arr[row][col - 1])
            max = Math.max(max, 1 + howManyForThis(arr, row, col - 1, num));

        if (isValidPlace(arr, row + 1, col) && arr[row][col] + num == arr[row + 1][col])
            max = Math.max(max, 1 + howManyForThis(arr, row + 1, col, num));

        if (isValidPlace(arr, row - 1, col) && arr[row][col] + num == arr[row - 1][col])
            max = Math.max(max, 1 + howManyForThis(arr, row - 1, col, num));

        return max;

    }

    public static int longestSlope(int[][] arr, int num) {
        return longestSlope(arr, 0, 0, num);
    }

    private static boolean isValidPlace(int[][] arr, int row, int col) {
        return row > -1 && col > -1 && row < arr.length && col < arr[0].length;
    }

    // ***************************************** 2009B ************************************************* //

    public static boolean samePattern(String s1, String s2) {
        if (s1.length() == 0 && s2.length() == 0 || s1.length() == 0 && s2.length() == 1 && s2.charAt(0) == '*')
            return true;

        if (s2.length() == 0 || s1.length() == 0)
            return false;

        if (s1.charAt(0) != s2.charAt(0) && s2.charAt(0) != '*')
            return false;


        return samePattern(s1.substring(1), s2.substring(1)) || (samePattern(s1.substring(1), s2) && s2.charAt(0) == '*');
    }

    public static boolean isPythagorean(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int middle = right - 1;

        while (right != middle) {
            int a = arr[left] * arr[left];
            int b = arr[middle] * arr[middle];
            int c = arr[right] * arr[right];

            if (a + b == c)
                return true;

            if (a + b > c)
                middle--;
            else
                left++;

            if (left == middle) {
                right--;
                left = 0;
                middle = right - 1;
            }
        }
        return false;
    }


}
