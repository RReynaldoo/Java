//----------------------------------The Shortcut way------------------------------------------------------------
// -> Is used to assign and retrieve a vlaue
// {} are used to execute something before assigning a value
// yeild,  is used after a {} to retrive the value to the variable
//defaul, is the normal way
// semicolon is used at the end and no breaks are required since each case  ends once the value is assigned.

String departureName;

departmentName = switch (departmentCode) {
    case 'A' -> "Accounting";
    case 'M' -> {
        System.out.println("Note that the Marketing Department");
        System.out.println("is closed on Friday");
        yield "Marketing";
    }
    default -> "Invalid";
};

//---------------------------------In a normal way------------------------------------------------

String departmentName = "";
switch (departmentCode) {
    case 'A':
        departmentName = "Accounting";
        break;
    case 'M':
        System.out.println("Note that the Marketing Department");
        System.out.println("is closed on Friday");
        departmentName = "Marketing";
        break;
    default:
        departmentName = "Invalid";
        break;
}