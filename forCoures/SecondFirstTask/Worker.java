package SecondFirstTask;

public class Worker {
    ContactInformation contactInformation;
    StatusEmployee statusEmployee;
    Men men;
    Worker(Men men,ContactInformation contactInformation,StatusEmployee statusEmployee) {
        this.men = men;
        this.contactInformation = contactInformation;
        this.statusEmployee = statusEmployee;
    }
}
