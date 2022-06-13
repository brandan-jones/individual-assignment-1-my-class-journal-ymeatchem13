package edu.uc.cech.soit.myclassjournal.dao;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JournalEntryDAOStub implements IJournalEntryDAO{

    List<JournalEntry> allJournalEntries = new ArrayList<JournalEntry>();

    @Override
    public JournalEntry save(JournalEntry journalEntry) throws Exception {
        allJournalEntries.add(journalEntry);
        return journalEntry;
    }

    @Override
    public List<JournalEntry> fetchAll() {
        return allJournalEntries;
    }
}
