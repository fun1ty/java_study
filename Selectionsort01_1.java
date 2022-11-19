package classes;
class Selectionsort01_1 
{
	public static void main(String[] args) 
	{   int [] vArr = new int[args.length];
		Selectionsort01_1 obj= new Selectionsort01_1();

		for (int i=0; i<args.length ; i++ )
		{
			for (int j =i+1; j<args.length; j++)
			{
				if (Integer.parseInt(args[i])> Integer.parseInt(args[j]))
				{
					obj.swap(args, i, j);
				}
			}
			System.out.print(args[i]+" ");
		}
}

void  swap(String[] str, int x, int y){
	String tmp = str[x];
	str[x]=str[y];
	str[y]=tmp;
}
void selectSort(String[] arr){
	int minIdx=0;
	for (int i=0; i<arr.length-1 ;i++ ){
		minIdx=i;
		for (int j=i+1; j<arr.length ; j++){
			if (Integer.parseInt(arr[minIdx])>Integer.parseInt(arr[j]))
			{
				minIdx=j;
			}
		}
		swap(arr,i,minIdx);
	}
	for (int i =0 ; i<arr.length ; i++)
	{
		System.out.print(arr[i]);
		}
	}
}