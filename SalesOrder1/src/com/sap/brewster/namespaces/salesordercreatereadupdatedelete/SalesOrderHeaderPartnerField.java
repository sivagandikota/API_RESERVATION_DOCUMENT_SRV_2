
package com.sap.brewster.namespaces.salesordercreatereadupdatedelete;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntityField;


/**
 * Template class to represent entity fields of the Entity {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPartner SalesOrderHeaderPartner}. Instances of this object are used in query modifier methods of the entity
 * fluent helpers. Contains methods to compare a field's value with a provided value.
 * 
 * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData
 * field names, so use the constructor with caution.
 * 
 * @param <FieldT>
 * Field type
 * 
 */
public class SalesOrderHeaderPartnerField<FieldT >
    extends EntityField<SalesOrderHeaderPartner, FieldT>
    implements SalesOrderHeaderPartnerSelectable
{


    /**
     * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData field names, so use with caution.
     * 
     * @param fieldName
     *     OData field name. Must match the field returned by the underlying OData service.
     */
    public SalesOrderHeaderPartnerField(final String fieldName) {
        super(fieldName);
    }

}
