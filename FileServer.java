import java.io.*;

import java.rmi.*;

public class FileServer

{

public static void main(String args[])

{

try

{

FileServerImpl fileserverimpl=new FileServerImpl();

Naming.rebind("FileServer",fileserverimpl);

}

catch(Exception e)

{

System.out.println(e);

}

}

}
