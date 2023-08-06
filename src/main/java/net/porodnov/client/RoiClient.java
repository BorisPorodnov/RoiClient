package net.porodnov.client;

import net.porodnov.model.PetitionListDataModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "roiClient", url = "https://www.roi.ru/api/")
// мы гов. что этот интерф. представляет из себя клиент
public interface RoiClient {
    //https://www.roi.ru/api/petitions/poll.json
    @RequestMapping(method = RequestMethod.GET, value = "/petitions/poll.json")
    PetitionListDataModel getPoll();
}
