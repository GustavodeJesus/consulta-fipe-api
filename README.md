# consulta-fipe-api

    public interface ITruckMaker extends IVehicleMaker {
        void printLog();
    }


    public class TruckMaker implements ITruckMaker {

        private static final Logger LOGGER = LoggerFactory.getLogger(TruckMaker.class);


        @Override
        public IVehicle makeVehicle(FipeVehicle vehicle) {
            return new Truck(
                    vehicle.getValue(),
                    vehicle.getBrand(),
                    vehicle.getModel(),
                    vehicle.getModelYear(),
                    vehicle.getFuelType(),
                    vehicle.getFipeCode(),
                    vehicle.getReferenceMonth(),
                    vehicle.getFuelTypeAbbreviation()
            );
        }
    
        @Override
        public void printLog() {
            LOGGER.info(TruckMaker.class.getSimpleName());
        }
    }


