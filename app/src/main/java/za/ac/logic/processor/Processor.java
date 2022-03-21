package za.ac.logic.processor;

import java.util.ArrayList;
import java.util.List;

import za.ac.logic.question.Question;
import za.ac.logic.user.User;

public class Processor {


    public Processor(){}

    public List<User> userList(){

        List users = new ArrayList<>();

        User userOne = new User("Tresor",2222, 30, "tresr@ac.za");
        User userTwo = new User("Enock",1111, 25, "enock@ac.za");
        User userThree = new User("David",3333, 22, "david@ac.za");


        users.add(userOne);
        users.add(userTwo);
        users.add(userThree);


        return users;
    }

    public boolean validUser(String name, int studentNum){

        boolean isvalid=true;
        List<User> users =userList();

        int x=0;
        int isFound =-1;

        // search student by student number
        while(x<users.size() && users.get(x).getName().compareTo(name)!=0){
            x++;
        }
        if(x==users.size()){
            isvalid = false;
        }else{
            if(users.get(x).getStudentNumber()== studentNum){
                isvalid = true;
            }else{
                isvalid = false;
            }
        }

        return isvalid;

    }

    public User getCurrentUser(int studentNum) {
        List users = userList();

        User currentUser= new User();
        for(int i=0; i<users.size();i++){
            User user = (User)users.get(i);


            if(user.getStudentNumber() == studentNum){
                currentUser = user;
            }

        }
        return currentUser;
    }

    public int determineMarks(Question[] questions, Boolean []responses){

        int finalMark=0;

        for (int i=0;i<questions.length;i++){
            if (questions[i].getResponse()==responses[i]){
                finalMark+=0;
            }
        }
       return finalMark;
    }

}
