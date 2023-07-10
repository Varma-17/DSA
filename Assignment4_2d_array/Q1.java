class Solution
{

  public static boolean binary_search(int arr[], int n, int element)
  {
    int l = 0, h = n - 1;
    while (l <= h)
    {
        int mid = (l + h) / 2;
        if (arr[mid] == element)
        {
          return true;
        }
        else if (arr[mid] > element)
        {
          h = mid - 1;
        }
        else
        {
          l = mid + 1;
        }
    }
    return false;
  }
	
public static void findCommon(int a[], int b[], int c[], int n1, int n2,int n3)
{

	for (int j = 0; j < n1; j++)
	{
	if (j != 0 && a[j] == a[j - 1]) {
			continue;
		}

		if (binary_search(b, n2, a[j]) && binary_search(c, n3, a[j])) {
			System.out.print(a[j] + " ");

		}
	}
}
