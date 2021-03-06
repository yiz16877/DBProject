package team_random.DBProject.service;

import team_random.DBProject.model.RegionManager;
import team_random.DBProject.model.Transaction;

import java.util.List;
import java.util.Map;

public interface RegionManagerService {
    void save(RegionManager mana);
    RegionManager findByName(String name);
    List<Transaction> findByRegionId(int regionId);
    List<Map<String,String>> showAllRegionsTrans();
    List<Map<String, String>> showTransInRegion(int region_manager_id);
    //keyword: name of store
    List<Map<String, String>> reviewAllByStoreManager(int region_manager_id, String search_keyword);

    List<Map<String, String>> searchAndSortOfReviewRegions(String search_keyword);
}
