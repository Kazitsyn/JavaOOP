package StudentService;

import StudentDomen.User;

import java.util.Collection;

public class AverageAge<A extends iAverageAge> {
    private Collection<A> collection;
    private String classType;

    public AverageAge(Collection<A> collection) {
        this.collection = collection;
        for (A obj: collection){
            this.classType = obj.getClass().getSimpleName();
        }
    }

    public  Double averageAge()
    {
        double sum = 0;
        int age = 0;
        for(A obj: collection)
        {
            age = obj.getAge();
            sum += age;
        }
        sum=sum/collection.size();
        return sum;
    }


    @Override
    public String toString() {
        return "Average age " + classType + "s = " +
                averageAge() +
                '.';
    }
}
