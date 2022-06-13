package edu.uc.cech.soit.myclassjournal;

import edu.uc.cech.soit.myclassjournal.dao.IJournalEntryDAO;
import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import edu.uc.cech.soit.myclassjournal.service.IJournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class MyClassJournalController{

    @Autowired
    IJournalService journalService;

    /**
     * Handle the root (/) endpoint and return a start page
     * @return
     */
    @RequestMapping("/")
    public String index() {
        return "start";
    }

    @PostMapping(value="/journalEntry", consumes="application/json", produces="application/json")
    public JournalEntry createJournalEntry(@RequestBody JournalEntry journalEntry) {
        JournalEntry newJournalEntry = null;
        try {
            newJournalEntry = journalService.save(journalEntry);
        } catch (Exception e) {
            // Todo add logging
        }
        return newJournalEntry;
    }

    @GetMapping("/journalEntry")
    @ResponseBody
    public List<JournalEntry> fetchAllJournalEntries() {
        return journalService.fetchAll();
    }
}
