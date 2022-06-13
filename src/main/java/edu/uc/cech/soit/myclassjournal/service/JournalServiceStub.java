package edu.uc.cech.soit.myclassjournal.service;

import edu.uc.cech.soit.myclassjournal.dao.IJournalEntryDAO;
import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ExecutionException;

@Service
public class JournalServiceStub implements IJournalService{
    @Autowired
    private IJournalEntryDAO journalEntryDAO;

    public JournalServiceStub() {

    }

    public JournalServiceStub(IJournalEntryDAO journalEntryDAO) {
        this.journalEntryDAO = journalEntryDAO;
    }

    @Override
    public JournalEntry save(JournalEntry journalEntry) {
        try {
            journalEntryDAO.save(journalEntry);
        }
        catch (Exception e) {
            // Todo add logging
        }
        return journalEntry;
    }

    @Override
    public List<JournalEntry> fetchAll() {
        return journalEntryDAO.fetchAll();
    }
}
