package listfilesutil;
import java.io.File;
public class ListFilesUtil 
{
  public void ListFilesAndFolders(String directoryName)
  {
    File directory=new File(directoryName);
    File[] fList=directory.listFiles();
    for(File file:fList)
    {
      System.out.println(file.getName());
    }
  }
  public void listFiles(String directoryName)
  {
    File directory=new File(directoryName);
    File[] fList=directory.listFiles();
    for(File file:fList)
    {
      if(file.isFile())
      {
        System.out.println(file.getName());
      }
    }
  }
  public void listFolders(String directoryName)
  {
    File directory=new File(directoryName);
    File[] fList=directory.listFiles();
    for(File file:fList)
    {
      if(file.isDirectory())
      {
        System.out.println(file.getName());
      }
    }
  }
  public void listFilesAndFilesSubDirectories(String directoryName)
  {
    File directory=new File(directoryName);
    File[] fList=directory.listFiles();
    for(File file:fList)
    {
      if(file.isFile())
      {
        System.out.println(file.getAbsolutePath());
      }
      else if(file.isDirectory())
      {
        listFilesAndFilesSubDirectories(file.getAbsolutePath());
      }
    }
  }
  public static void main(String[] args) 
  {
    ListFilesUtil listFilesUtil=new ListFilesUtil();
    final String directoryWindows="G:\\Amrutha\\My Codes\\java";
    listFilesUtil.listFiles(directoryWindows);
  }
}
