public class Test
{
    public Test()
    {
    }

    public int Test1(String fileToFind)
    {
        MusicOrganizer musicOrganizer = new MusicOrganizer();
        musicOrganizer.addFile("a");
        musicOrganizer.addFile("b");
        musicOrganizer.addFile("c");
        musicOrganizer.addFile("d");
        int a = musicOrganizer.findFirst(fileToFind);
        return a;
    }
}