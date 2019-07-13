class validate
{
static boolean checknum(String a)
{
StringBuffer str=new StringBuffer(a);
int flag=0;
for(int i=0;i<str.length();i++)
{
int x=(int)str.charAt(i);
if(x<48 || x>57)
{
flag=1;
return false;

}
}
return true;

}
static boolean checkstring(String a)
{
StringBuffer str=new StringBuffer(a);
int flag=0;
for(int i=0;i<str.length();i++)
{
int x=(int)str.charAt(i);
if((x<65 || x>90)&&(x<97 || x>122)&& x!=32 )
{
flag=1;
return false;
}
} 
return true;	
}

public static void main(String ar[])
{
}
}