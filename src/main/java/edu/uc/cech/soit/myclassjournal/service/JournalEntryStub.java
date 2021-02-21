package edu.uc.cech.soit.myclassjournal.service;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JournalEntryStub implements IJournalService{

    List<JournalEntry> allJournalEntries = new ArrayList<>();

    @Override
    public void save(JournalEntry journalEntry) {
        allJournalEntries.add(journalEntry);
    }

    @Override
    public List<JournalEntry> fetchAll() {
        return allJournalEntries;
    }
}
