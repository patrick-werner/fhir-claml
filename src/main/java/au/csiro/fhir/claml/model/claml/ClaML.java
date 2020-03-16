//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1-b171012.0423 
//         See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.04.13 at 05:46:14 PM AEST 
//


package au.csiro.fhir.claml.model.claml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}Meta" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}Identifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}Title"/&gt;
 *         &lt;element ref="{}Authors" minOccurs="0"/&gt;
 *         &lt;element ref="{}Variants" minOccurs="0"/&gt;
 *         &lt;element ref="{}ClassKinds"/&gt;
 *         &lt;element ref="{}UsageKinds" minOccurs="0"/&gt;
 *         &lt;element ref="{}RubricKinds"/&gt;
 *         &lt;element ref="{}Modifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}ModifierClass" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}Class" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "meta",
    "identifier",
    "title",
    "authors",
    "variants",
    "classKinds",
    "usageKinds",
    "rubricKinds",
    "modifier",
    "modifierClass",
    "clazz"
})
@XmlRootElement(name = "ClaML")
public class ClaML {

    @XmlElement(name = "Meta")
    protected List<Meta> meta;
    @XmlElement(name = "Identifier")
    protected List<Identifier> identifier;
    @XmlElement(name = "Title", required = true)
    protected Title title;
    @XmlElement(name = "Authors")
    protected Authors authors;
    @XmlElement(name = "Variants")
    protected Variants variants;
    @XmlElement(name = "ClassKinds", required = true)
    protected ClassKinds classKinds;
    @XmlElement(name = "UsageKinds")
    protected UsageKinds usageKinds;
    @XmlElement(name = "RubricKinds", required = true)
    protected RubricKinds rubricKinds;
    @XmlElement(name = "Modifier")
    protected List<Modifier> modifier;
    @XmlElement(name = "ModifierClass")
    protected List<ModifierClass> modifierClass;
    @XmlElement(name = "Class")
    protected List<Class> clazz;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the meta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Meta }
     * 
     * 
     */
    public List<Meta> getMeta() {
        if (meta == null) {
            meta = new ArrayList<Meta>();
        }
        return this.meta;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Identifier }
     * 
     * 
     */
    public List<Identifier> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<Identifier>();
        }
        return this.identifier;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link Title }
     *     
     */
    public Title getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link Title }
     *     
     */
    public void setTitle(Title value) {
        this.title = value;
    }

    /**
     * Gets the value of the authors property.
     * 
     * @return
     *     possible object is
     *     {@link Authors }
     *     
     */
    public Authors getAuthors() {
        return authors;
    }

    /**
     * Sets the value of the authors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Authors }
     *     
     */
    public void setAuthors(Authors value) {
        this.authors = value;
    }

    /**
     * Gets the value of the variants property.
     * 
     * @return
     *     possible object is
     *     {@link Variants }
     *     
     */
    public Variants getVariants() {
        return variants;
    }

    /**
     * Sets the value of the variants property.
     * 
     * @param value
     *     allowed object is
     *     {@link Variants }
     *     
     */
    public void setVariants(Variants value) {
        this.variants = value;
    }

    /**
     * Gets the value of the classKinds property.
     * 
     * @return
     *     possible object is
     *     {@link ClassKinds }
     *     
     */
    public ClassKinds getClassKinds() {
        return classKinds;
    }

    /**
     * Sets the value of the classKinds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassKinds }
     *     
     */
    public void setClassKinds(ClassKinds value) {
        this.classKinds = value;
    }

    /**
     * Gets the value of the usageKinds property.
     * 
     * @return
     *     possible object is
     *     {@link UsageKinds }
     *     
     */
    public UsageKinds getUsageKinds() {
        return usageKinds;
    }

    /**
     * Sets the value of the usageKinds property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageKinds }
     *     
     */
    public void setUsageKinds(UsageKinds value) {
        this.usageKinds = value;
    }

    /**
     * Gets the value of the rubricKinds property.
     * 
     * @return
     *     possible object is
     *     {@link RubricKinds }
     *     
     */
    public RubricKinds getRubricKinds() {
        return rubricKinds;
    }

    /**
     * Sets the value of the rubricKinds property.
     * 
     * @param value
     *     allowed object is
     *     {@link RubricKinds }
     *     
     */
    public void setRubricKinds(RubricKinds value) {
        this.rubricKinds = value;
    }

    /**
     * Gets the value of the modifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Modifier }
     * 
     * 
     */
    public List<Modifier> getModifier() {
        if (modifier == null) {
            modifier = new ArrayList<Modifier>();
        }
        return this.modifier;
    }

    /**
     * Gets the value of the modifierClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modifierClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModifierClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModifierClass }
     * 
     * 
     */
    public List<ModifierClass> getModifierClass() {
        if (modifierClass == null) {
            modifierClass = new ArrayList<ModifierClass>();
        }
        return this.modifierClass;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clazz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClazz().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Class }
     * 
     * 
     */
    public List<Class> getClazz() {
        if (clazz == null) {
            clazz = new ArrayList<Class>();
        }
        return this.clazz;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}