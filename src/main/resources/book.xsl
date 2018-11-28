<?xml version="1.0" encoding="UTF-8"?>
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema" targetNamespace="book" elementFormDefault="qualified">
    <xs:element name="GetBookDetailsRequest">
        <xs:complexType>
            <xs:sequence>
                <xs:element name= "id" type="xs:int"/>
            </xs:sequence>
        </xs:complexType>
    </xs:element>
    <xs:element name="GetBookDetailsResponse">
        <xs:complexType>
            <xs:sequence>
                <xs:element name="id" type="xs:integer"/>
                <xs:element name="name" type="xs:string"/>
                <xs:element name="author" type="xs:string"/>
                <xs:element name="genre" type="xs:string"/>
                <xs:element name="pageNumber" type="xs:integer"/>
                <xs:element name="format" type="xs:string"/>
                <xs:element name="releaseDate" type="xs:string"/>
            </xs:sequence>
        </xs:complexType>
    </xs:element>
    <xs:complexType name="BookDetails">
        <xs:sequence>
            <xs:element name="id" type="xs:integer"/>
            <xs:element name="name" type="xs:string"/>
            <xs:element name="author" type="xs:string"/>
            <xs:element name="genre" type="xs:string"/>
            <xs:element name="pageNumber" type="xs:integer"/>
            <xs:element name="format" type="xs:string"/>
            <xs:element name="releaseDate" type="xs:string"/>
        </xs:sequence>
    </xs:complexType>
</xs:schema>