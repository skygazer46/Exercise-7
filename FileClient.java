import java.rmi.*;

public class FileClient

{

public static void main(String ar[])

{

try

{

String fileserverURL="rmi://"+ar[0]+"/FileServer";

FileServerIntf fileserverintf=(FileServerIntf)

Naming.lookup(fileserverURL);

System.out.println("The path of Source file is:"+ar[1]);

System.out.println("The path of Destination file is:"+ar[2]);

fileserverintf.FileCopy(ar[1],ar[2]);

}

catch(Exception e)

{

System.out.println(e);

}

}

}
