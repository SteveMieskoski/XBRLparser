# XBRLparser

(i.e. in-progress)\
extracts financial concept facts from a xbrl conformant xml file, and provides the option to return the content as an excell file.  This is the initial starting point with additinal features (such as processing the linkbase refs) planned to expand this into a more complete Xbrl parsing utility.

## Basic Overview:
Create a library with the purpose of extracting numeric and contextual content from financial statements following the XBRL 2.1 specification.

## Goal:
Return an object to enable further operations upon the content. Including natural language association (e.g. using display labels as one part in processing the content into a normalized form.) or persistence

## Why:
I was unable to find comprehensive financial data for the right price.  Thus, this began as a component of a economic/financial data gathering application. However due to the complexity involved it was extracted(cut) into a project onto itself.

## History:
Initially used JAXB to process the us-gaap schema and unmarshall the content, but changed to a DOM based approach to extract the elements with little or no data loss.  Followed by subsequent processing to connect the associations, dimensions, etc. This is generally the approach I am currently pursuing.
