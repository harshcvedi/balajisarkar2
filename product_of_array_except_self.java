
    public static void main (String args[]) {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    long []ar=new long [n];
    for(int i=0;i<n;i++)
    {
        ar[i]=scn.nextLong();
    } 
    Array_Except_Self(ar);
  
    }

  public static void Array_Except_Self(long[] arr) {
		long[] left = new long[arr.length];
		left[0] = 1;
		for (int i = 1; i < left.length; i++) {
			left[i] = arr[i - 1] * left[i - 1];
		}
		long[] right = new long[arr.length];
		right[arr.length - 1] = 1;
		for (int i = right.length - 2; i >= 0; i--) {
			right[i] = right[i + 1] * arr[i + 1];

		}
		for (int i = 0; i < right.length; i++) {
			left[i] = left[i] * right[i];
		}
		for(int i=0;i<left.length;i++)
        System.out.print(left[i]+" ");
  }
  }
