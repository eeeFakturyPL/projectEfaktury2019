package pl.abc.faktury.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.abc.faktury.model.dto.BillDto;
import pl.abc.faktury.model.entity.Bill;
import pl.abc.faktury.repository.BillRepository;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BillService {

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private BillRepository billRepository;

    public void addBill(BillDto billDto){
        Bill bill = mapper.map(billDto, Bill.class);
        billRepository.save(bill);
    }

    public List<BillDto> getAllBill(){
        List<Bill> bills = billRepository.findAll();
        for (Bill b : bills){
            System.out.println("Bill "+b.getId()+" "+b.getCustomerName()+" "+b.getNrFakt()+" "+b.getDate()+" "+b.getPrice());
        }
        return  bills.stream().map(b->mapper.map(b, BillDto.class)).collect(Collectors.toList());
    }

    public Bill getBillByCustomerName(String customerName){
        return billRepository.findBillByCustomerName(customerName);
    }

    public Bill getBillByNrFakt(String nrFakt){
        return billRepository.findBillByNrFakt(nrFakt);
    }


}
