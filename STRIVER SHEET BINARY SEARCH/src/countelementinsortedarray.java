class countelementinsortedarray {
    public static void main(String[] args) {
        int[] arr={1, 1, 2, 2, 2, 2, 3};
        int x=2;
        int n=arr.length;
        int first=-1,last=-1;
        first=fsearch(arr,n,x);
        if(first==-1)
        {
            System.out.println(0);
        }
        last=lsearch(arr,n,x);
        int cnt=last-first+1;
        System.out.print(cnt);
    }
    public static int fsearch(int[] a,int n,int x)
    {
        int low=0,high=n-1;
        int first=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(a[mid]==x)
            {
                first=mid;
                high=mid-1;
            }
            else if(a[mid]>x)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return first;
    }
    public static int lsearch(int[] a,int n,int x)
    {
        int low=0,high=n-1;
        int last=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(a[mid]==x)
            {
                last=mid;
                low=mid+1;
            }
            else if(a[mid]>x)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return last;
    }
}
