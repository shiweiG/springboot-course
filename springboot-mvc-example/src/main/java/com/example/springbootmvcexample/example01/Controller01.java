package com.example.springbootmvcexample.example01;

import com.example.springbootmvcexample.entity.Address;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@RequestMapping("/api/example01/")
@RestController
@Slf4j
public class Controller01 {
    @GetMapping("index")
  public Map getIndex(){
      return Map.of("name","sun");
  }
      @GetMapping("address")
  public List getAddress(){
      Address a1=new Address(1,"956","aaa", LocalDateTime.now());
      Address a2=new Address(1,"956","aaa", LocalDateTime.now());
      Address a3=new Address(1,"956","aaa", LocalDateTime.now());

      return  List.of(a1,a2,a3);
  }


   /*  @GetMapping("/address")
    public Map getaddresses(){
         Address a1=new Address(1,"956","aaa", LocalDateTime.now());
         Address a2=new Address(1,"956","aaa", LocalDateTime.now());
         Address a3=new Address(1,"956","aaa", LocalDateTime.now());
         return Map.of("addresses",List.of(a1,a2,a3),"name","bo");

    }
*/      @PostMapping("address")
     public Map postAddress(@RequestBody Address address){
         log.debug(address.getDetail());
         log.debug(address.getComment());

         return Map.of("address","956");
     }
         @GetMapping("address/{aid}")
    public Map postAddress(@PathVariable int aid){
           Address address=ADDRESSES.stream()
                .filter(a->a.getId()== aid)
                .findFirst()
                .orElse(new Address());
        return Map.of("address",address);


     }
    private final List<Address> ADDRESSES = create();
    private List<Address> create() {
        Address a1 = new Address(1, "956", "a", LocalDateTime.now());
        Address a2 = new Address(2, "925", "b", LocalDateTime.now());
        Address a3 = new Address(3, "121", "c", LocalDateTime.now());
        return List.of(a1, a2, a3);
    }

  }


