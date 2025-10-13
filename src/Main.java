import models.entities.Contract;
import models.entities.Installment;
import models.service.ContractService;
import models.service.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Numero: ");
        Integer number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        sc.nextLine();
        LocalDate start = LocalDate.parse(sc.nextLine(), fmt);
        System.out.print("Entre com o valor do contrato: ");
        Double value = sc.nextDouble();

        Contract contract = new Contract(value, start, number);

        System.out.print("Entre com o numero de parcelas: ");
        Integer parcelas = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

<<<<<<< HEAD
                itemCsv = br.readLine();
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targtFileStr))) {
                for (Product items : list) {
                    bw.write(items.getName() + "," + String.format("%.2f", items.total()));
                    bw.newLine();
                }
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
=======
        contractService.processContract(contract, parcelas);


        System.out.println("Parcelas: ");
        for (Installment installment : contract.getInstallments()){
            System.out.println(installment);
>>>>>>> e6c92d0 (resolvido)
        }


        sc.close();
    }
}