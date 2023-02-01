//Given an integer array arr of size n, you need to sum the elements of arr.
class Get
{
    public static int sumElement(int arr[], int n)
    {
        // Your code here
        int sum = 0;
        for(int i:arr)
            sum += i;
        return sum;
    }
}
