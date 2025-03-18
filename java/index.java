// foreach lambda get index
        int[] index = {0};
        list.forEach(mrDiagnosPO -> {
            IMedicalGetDiagnoseVO iMedicalGetDiagnoseVO = new IMedicalGetDiagnoseVO();
            iMedicalGetDiagnoseVO.setDiseId(mrDiagnosPO.getId());
            iMedicalGetDiagnoseVO.setInoutDiseType(mrDiagnosPO.getDiagTypeDr().toString());
            iMedicalGetDiagnoseVO.setMainDiagFlag(mrDiagnosPO.getMainDiagFlag());
            iMedicalGetDiagnoseVO.setDiagnosDesc(mrDiagnosPO.getDescription());
            iMedicalGetDiagnoseVO.setSortNum(++index[0]);
            out.add(iMedicalGetDiagnoseVO);
        });