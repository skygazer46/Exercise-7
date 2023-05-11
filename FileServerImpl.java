import java.io.*;

import java.rmi.*;

import java.rmi.server.*;

class FileServerImpl extends UnicastRemoteObject implements FileServerIntf

{

public FileServerImpl()throws RemoteException

{

}

public void FileCopy(String d1,String d2)throws

RemoteException,IOException

{

String Str;

FileReader fr=new FileReader(d1);

BufferedReader br=new BufferedReader(fr);

FileWriter fw=new FileWriter(d2);

while((Str=br.readLine())!=null)

{

Str=Str+"\n\r";

char buf[]=new char[Str.length()];

Str.getChars(0,Str.length(),buf,0);

fw.write(buf);

}

fr.close();

fw.close();

System.out.println("File Copy Successfully");

}

}
