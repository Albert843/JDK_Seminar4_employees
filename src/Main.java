public class Main {
    public static void main(String[] args) {
        EmployeeCatalog catalog = new EmployeeCatalog();

        Employee employee1 = new Employee(1,7654321,"Dima",5);
        Employee employee2 = new Employee(2,8765432,"Anna",1);
        Employee employee3 = new Employee(3,9876543,"Oleg",7);
        Employee employee4 = new Employee(4,1234567,"Dima",3);

        catalog.addEmployee(employee1);
        catalog.addEmployee(employee2);
        catalog.addEmployee(employee3);
        catalog.addEmployee(employee4);
        System.out.println(catalog);
        System.out.println();

//      1. Добавить метод, который ищет сотрудника по стажу (может быть список)
        System.out.println("1. Поиск сотрудника по стажу. Должен вывести сотрудника Dima: ");
        System.out.println(catalog.searchByExperience(5));

//      2. Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
        System.out.println();
        System.out.println("2. Поиск сотрудника по номеру телефона. Должен вывести сотрудников с именем Dima: ");
        System.out.println(catalog.getPhoneByName("Dima"));

//      3. Добавить метод, который ищет сотрудника по табельному номеру
        System.out.println();
        System.out.println("3. Поиск сотрудника по табельному номеру. Должен вывести сотрудника с именем Oleg: ");
        System.out.println(catalog.searchByServiceNumber(3));

//      4. Добавить метод добавление нового сотрудника в справочник
        System.out.println();
        System.out.println("4. Добавляем сотрудника с именем Pavel: ");
        Employee employee5 = new Employee(5,1111111,"Pavel",10);
        catalog.addEmployee(employee5);

        System.out.println(catalog);
    }
}
