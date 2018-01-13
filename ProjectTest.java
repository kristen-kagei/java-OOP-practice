class ProjectTest{
    public static void main(String[] args) {
        Project project1 = new Project();
        Project project2 = new Project("project2");
        Project project3 = new Project("project3", "definitely not snoring");        
        
        String name = project3.getName();
        System.out.println("what's my name again: " + name);

        project1.setName("abracadabra");

        String magicName = project1.getName();
        System.out.println(magicName);

        project2.setDescription("nothing here to see, assholes");

        String project2Description = project2.getDescription();
        System.out.println(project2Description);
        System.out.println(project3);
    }
}