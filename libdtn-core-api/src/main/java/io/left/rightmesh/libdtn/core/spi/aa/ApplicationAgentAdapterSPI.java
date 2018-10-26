package io.left.rightmesh.libdtn.core.spi.aa;

import io.left.rightmesh.libdtn.common.utils.Log;
import io.left.rightmesh.libdtn.core.api.ConfigurationAPI;
import io.left.rightmesh.libdtn.core.api.RegistrarAPI;
import io.left.rightmesh.libdtn.core.spi.ModuleSPI;

/**
 * Contract to be provided by an application agent adapter.
 *
 * @author Lucien Loiseau on 23/10/18.
 */
public interface ApplicationAgentAdapterSPI extends ModuleSPI {

    /**
     * Initialize this module.
     *
     * @param api
     */
    void init(RegistrarAPI api, ConfigurationAPI conf, Log logger);

}